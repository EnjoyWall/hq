/**
 * 
 */
package com.hq.learn.bigpipe;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-27 下午03:19:54
 */
public abstract class Paglet implements Runnable {

	protected final HttpServletResponse response;

	private final BigPipeServlet.PageletCount pageletCount;

	/**
	 * @param response
	 */
	public Paglet(BigPipeServlet.PageletCount pageletCount,
			HttpServletResponse response) {
		super();
		this.response = response;
		this.pageletCount = pageletCount.add();
	}

	private final void write(StringBuffer value) {

		synchronized (this.response) {
			try {
				response.getWriter().write(value.toString());
				// response.getWriter().flush();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	protected abstract StringBuffer getContent();

	@Override
	public final void run() {
		try {
			this.write(getContent());

			try {
				response.getWriter().flush();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} finally {
			synchronized (pageletCount) {
				if (this.pageletCount.decrease() < 1) {
					pageletCount.notify();
				}
			}
		}
	}

}
