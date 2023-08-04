package com;

import java.util.Random;

class MyCounter implements Runnable{
	private int threadNo;

	public MyCounter(int threadNo) {  //constructor 
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random=new Random();
		for(int i=0;i<=9;i++)
		{
			
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("the value of i is: "+i+"and the thread number is:" +threadNo);

		}
	}
	
	
}






public class App {

	public static void main(String[] args) throws InterruptedException{
		
		Thread thread1 =new Thread(new MyCounter(1));
		Thread thread2 =new Thread(new MyCounter(2));
		
		
		thread1.start();
		thread2.start();
		
	}

}

