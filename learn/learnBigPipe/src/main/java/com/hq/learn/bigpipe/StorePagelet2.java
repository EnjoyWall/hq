/**
 * 
 */
package com.hq.learn.bigpipe;

import javax.servlet.http.HttpServletResponse;

import com.hq.learn.bigpipe.BigPipeServlet.PageletCount;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-28 下午05:38:24
 */
public class StorePagelet2 extends Paglet {

	/**
	 * @param pageletCount
	 * @param response
	 */
	public StorePagelet2(PageletCount pageletCount, HttpServletResponse response) {
		super(pageletCount, response);

	}

	@Override
	protected StringBuffer getContent() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		return new StringBuffer(
				
				"  <script>  bigpipeFun({id:'big2',html:'<div class=\"store-name\"><h2>许府牛杂文三店</h2><span title=\"通过阿里旺旺和“展炎”进行交流\" data-wwid=\"展炎\" class=\"k2-ww\">阿里旺旺在线</span></div><div class=\"store-card\"><b>9</b><span>.3</span><em>折</em></div><!--<div class=\"store-card-t\"></div>--><div class=\"store-level\"><div>有<span class=\"s-num\">2004</span>到此店持卡消费&nbsp;&nbsp;&nbsp;&nbsp;好评率<span class=\"s-num\">99%</span></div><div>商户等级<s></s><s></s></div></div>',css:'http://kxt.koubei.com/product/store/v1/css/detail.css'});</script>");
	}

}
