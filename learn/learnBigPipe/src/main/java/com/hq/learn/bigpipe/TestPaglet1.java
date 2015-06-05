/**
 * 
 */
package com.hq.learn.bigpipe;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-27 下午03:31:50
 */
public class TestPaglet1 extends Paglet {

	private final int second;

	public TestPaglet1(BigPipeServlet.PageletCount pageletCount,
			HttpServletResponse response, int second) {
		super(pageletCount, response);
		this.second = second;
	}

	/**
	 * @return
	 */
	protected StringBuffer getContent() {
		return new StringBuffer("<h1>pagelet " + second + "</h1>");
	}
}
