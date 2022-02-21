package com.org.gen.day8;

public class YieldDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         YieldDemo y = new YieldDemo();
         Thread t1 = new Thread(y,"First child thread");
         
         YieldDemo y1 = new YieldDemo();
         Thread t2 = new Thread(y1,"Second child thread");
         
         t1.setPriority(4);
         t2.setPriority(8); //t2 has higher priority so t2 executed first
         
         t1.start();
         t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("current thread "+Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}
	

}
