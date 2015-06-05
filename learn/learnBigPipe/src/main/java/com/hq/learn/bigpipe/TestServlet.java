/**
 * 
 */
package com.hq.learn.bigpipe;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-31 上午11:20:43
 */
public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		final Writer writer = resp.getWriter();
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					Thread.sleep(1000);
					writer.write("hello");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}
}
