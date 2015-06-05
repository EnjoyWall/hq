/**
 * 
 */
package com.hq.learn.bigpipe;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-27 下午03:18:59
 */
public class BigPipeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ExecutorService executor;

	@Override
	public void init() throws ServletException {
		super.init();
		executor = Executors.newCachedThreadPool();
	}

	@Override
	protected void doGet(final HttpServletRequest request,
			HttpServletResponse resp) throws ServletException, IOException {

		// final Object lock = new Object();

		final PageletCount pageletCount = new PageletCount();
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/store.jsp");
		dispatcher.include(request, resp);

		executor.execute(new StorePagelet1(pageletCount, resp));
		executor.execute(new StorePagelet2(pageletCount, resp));
		executor.execute(new StorePagelet3(pageletCount, resp));

		System.out.println("before end");

		synchronized (pageletCount) {
			try {
				pageletCount.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("leave main progross!");
		System.out.println("end");

	}

	static class PageletCount {
		private int count;

		public synchronized PageletCount add() {
			count++;
			return PageletCount.this;
		}

		public synchronized int decrease() {
			return --count;
		}
	}
}
