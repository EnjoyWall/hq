/**
 * 
 */
package com.hq.learn.bigpipe;

import javax.servlet.http.HttpServletResponse;

import com.hq.learn.bigpipe.BigPipeServlet.PageletCount;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-28 下午05:41:48
 */
public class StorePagelet3 extends Paglet {

	/**
	 * @param pageletCount
	 * @param response
	 */
	public StorePagelet3(PageletCount pageletCount, HttpServletResponse response) {
		super(pageletCount, response);

	}

	@Override
	protected StringBuffer getContent() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new StringBuffer(
				"   <script>  bigpipeFun({id:'big3',html:'<table><tr><td class=\"layout-side\"><div class=\"store-info-card\"><ul class=\"k2-fix-float\"><li>地址：<address title=\"文一路389号翠苑一区文一路389号翠苑一区文一路389号翠苑一区\">文一路389号翠苑一区文一路389号翠苑一区...</address></li><li>电话：<img class=\"tel\" src=\"http://count.koubei.com/showphone/showphone.php?f=jpg&amp;w=104&amp;h=10&amp;bc=255,255,255&amp;fc=0,0,0&amp;fs=10&amp;fn=arial&amp;phone=MTczODQ1MTY4Nw%253D%253D%2523OanzJ%252FYcrqP0aLYt5A%253D%253D\" alt=\"金穗子一品砂锅翠苑店电话\"></li><li>人均：50元</li><li>特色：有停车位&nbsp;&nbsp;有包厢&nbsp;&nbsp;有停车位&nbsp;&nbsp;有包厢&nbsp;&nbsp;有停车位&nbsp;&nbsp;有包厢&nbsp;&nbsp;<a href=\"#\" id=\"shtick-more-link\" class=\"s-more\">更多>></a></li></ul><div class=\"card-map\">地图</div><div class=\"card-ft k2-fix-float\"><a href=\"#\">我要纠错</a><a href=\"#\" target=\"_blank\" class=\"s-more\" id=\"detail-more-link\">更多详情>></a></div></div></td><td class=\"layout-bd\"><div class=\"store-info-extra\"><div class=\"pic-main k2-fix-float\"><a href=\"#\" class=\"arrow arrow-left-none\"></a><div class=\"pic-bd\"><ul id=\"s-slider-container\" class=\"k2-fix-float\"><li><a href=\"#\" target=\"_blank\"><div class=\"pic-wrap\"><img src=\"http://img1.kbcdn.com/n03_b/bd29/a2/5b/5048ccc7b5e381ae59b04ac86fb6_200x150.jpg\"/></div></a></li><li><a href=\"#\" target=\"_blank\"><div class=\"pic-wrap\"><img src=\"http://img3.kbcdn.com/n01_a/bd29/70/c8/c63a35564f7503fbc587bc17baa2_200x150.jpg\"/></div></a></li><li><a href=\"#\" target=\"_blank\"><div class=\"pic-wrap\"><img src=\"http://img3.kbcdn.com/n01_a/bd29/31/92/5df91e4218c34cfcbcda5fe8ad0b_200x150.jpg\"/></div></a></li><li><a href=\"#\" target=\"_blank\"><div class=\"pic-wrap\"><img class=\"delay\" src=\"\" data-src=\"http://img2.kbcdn.com/n02_a/bd29/2f/56/e00095b09b6664fc48f959afe901_200x150.jpg\"/></a></div></li><li><a href=\"#\" target=\"_blank\"><div class=\"pic-wrap\"><img class=\"delay\" src=\"\" data-src=\"http://img3.kbcdn.com/n02_b/bd29/40/7c/e5116fcb941544af8e572a83de68_200x150.jpg\"/></a></div></li></ul></div><a href=\"#\" class=\"arrow arrow-right\"></a></div><p class=\"pic-ft\"><a href=\"#\" target=\"_blank\">共15张图</a><a href=\"#\" target=\"_blank\">传图攒经验</a></p><div class=\"extra-item k2-fix-float\"><label>网友印象</label><div><span class=\"style-1\">性价比高</span><span class=\"style-2\">服务好</span><span class=\"style-3\">上菜慢</span><span class=\"style-1\">美女出没的地方</span><span class=\"style-2\">老板娘是美女</span><span class=\"style-3\">每次都要等位置</span><a href=\"#\" class=\"s-more\" id=\"impress-more-link\">更多>></a></div></div><div class=\"extra-item k2-fix-float\"><label>网友推荐</label><div class=\"promote-item\"><a href=\"#\" target=\"_blank\">精品牛杂<em>(224)</em></a><a href=\"#\" target=\"_blank\">精品牛杂<em>(224)</em></a><a href=\"#\" target=\"_blank\">精品牛杂<em>(224)</em></a><a href=\"#\" target=\"_blank\">牛杂拼盘<em>(224)</em></a><a href=\"#\" target=\"_blank\">牛杂拼盘<em>(224)</em></a><a href=\"#\" id=\"promote-more-link\" class=\"s-more\">更多>></a></div></div><div class=\"store-share k2-fix-float\"><a rel=\"nofollow\" href=\"#\" class=\"store-btn\">发表点评</a><a rel=\"nofollow\" href=\"#\" id=\"store-add-btn\" class=\"store-btn\" url=\"add.txt\">加入收藏</a><a rel=\"nofollow\" href=\"#\" id=\"store-tel-btn\" class=\"store-btn\">免费发送到手机</a><div id=\"share-bar\"><a title=\"分享给口碑好友\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-kb\">&nbsp;</a><a title=\"分享到QQ\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-qq\">&nbsp;</a><a title=\"分享到人人网\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-rr\">&nbsp;</a><a title=\"分享到新浪微博\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-sina\">&nbsp;</a><a id=\"share-bar-ex-btn\" class=\"ex-arrow\" href=\"#\">&nbsp;</a></div><div id=\"share-bar-pop\"><a title=\"分享给口碑好友\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-kb\">&nbsp;</a><a title=\"分享到QQ\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-qq\">&nbsp;</a><a title=\"分享到人人网\" href=\"#\" class=\"k2-icon-node-m k2icon-s-rr\">&nbsp;</a><a title=\"分享到新浪微博\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-sina\">&nbsp;</a><a id=\"share-bar-cl-btn\" class=\"cl-arrow\" href=\"#\">&nbsp;</a><p><a title=\"分享到开心网\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-kx\">分享到开心网</a><a title=\"分享到豆瓣\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-db\">分享到豆瓣</a><a title=\"分享到淘宝\" href=\"#\" class=\"k2-icon-node-m k2-icon-s-tb\">分享到淘宝</a></p></div><label>分享到：</label></div></div></td></tr></table> <input type=\"hidden\" value=\"1\" id=\"is-login\"><input type=\"hidden\" value=\"ca47478d2f4748c4bf88a82e73c0c38f\" id=\"store-id\"><input type=\"hidden\" value=\"金穗子一品砂锅翠苑店\" id=\"store-full-name\"><input type=\"hidden\" value=\"2595\" id=\"store-city\"><input type=\"hidden\" value=\"0571-88079199\" id=\"store-tel\"><input type=\"hidden\" value=\"文一路389号翠苑一区\" id=\"store-address\"><input type=\"hidden\" value=\"筒骨锅底 骨头砂锅 三鲜锅底\" id=\"store-promote\"><input type=\"hidden\" value=\"14525029\" id=\"user-id\"><input type=\"hidden\" value=\"0\" id=\"sm-times\">',css:'http://kxt.koubei.com/product/store/v1/css/store.css'});</script>");
	}

}
