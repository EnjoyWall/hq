/**
 * 
 */
package com.hq.learn.bigpipe;

import javax.servlet.http.HttpServletResponse;

import com.hq.learn.bigpipe.BigPipeServlet.PageletCount;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-28 下午05:34:39
 */
public class StorePagelet1 extends Paglet {

	/**
	 * @param pageletCount
	 * @param response
	 */
	public StorePagelet1(PageletCount pageletCount, HttpServletResponse response) {
		super(pageletCount, response);
	}

	@Override
	protected StringBuffer getContent() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		return new StringBuffer(
				"  <script>  bigpipeFun({id:'store-nav',html:'<ul class=\"nav-tabs\"> <li class=\"index\"><p class=\"current\"><span>首页</span></p></li><li><p><a href=\"#\">商户介绍</a></p></li><li><p><a href=\"#\">在线外卖</a></p></li><li><p><a href=\"#\">商户图片</a></p></li><li><p class=\"current\"><span>网友点评</span></p></li><li><p><a href=\"#\">商户公告</a></p></li></ul><a href=\"#\" class=\"manage-link\">商户管理</a>',css:'http://kxt.koubei.com/product/store/v1/css/storenav.css'}); </script>");
	}

}
