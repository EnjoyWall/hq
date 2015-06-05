/**
 * 
 */
package com.hq.learn.bigpipe.test;

/**
 * @author 百岁 （莫正华 baisui@taobao.com）
 * 
 *         2011-10-28 下午04:12:00
 */
public class MainProgross2 {
	private static byte[] sign = new byte[0];

	public static void main(String[] args) {
		SubProgross subProgross = new SubProgross();
		Thread subThread = new Thread(subProgross);
		long currentTime = System.currentTimeMillis();
		System.out.println("execute main progross!");
		subThread.start();
		
		
		
		synchronized (sign) {
			System.out.println("main progross get lock!");
			try {
				sign.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("leave main progross!");
		long endTime = System.currentTimeMillis();
		System.out.println("total time: " + (endTime - currentTime));

	}

	// 子过程
	static class SubProgross implements Runnable {
		public void run() {
			System.out.println("execute sub progross!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (sign) {
				System.out.println("sub progross get lock!");
				sign.notify();
			}
			System.out.println("leave sub progross!");
		}

	}

}
