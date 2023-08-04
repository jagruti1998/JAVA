package com;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {  //constructor 
		this.threadNo = threadNo;
	}
	
	 public void countMe() {
		 for(int i=1;i<=9;i++)
		 {
			 try {
				 sleep(1000);
			 }
			 catch(InterruptedException e)
			 {
				 e.printStackTrace();
			 }
			 System.out.println("the value of i is: "+i+"and the thread number is:" +threadNo);
		 }
	 }

	
}






public class App {

	public static void main(String[] args) {
		
		MyCounter counter1 =new MyCounter(1);
		MyCounter counter2 =new MyCounter(2);
		
		counter1.countMe();
		System.out.println("#########################"); //separator
		counter2.countMe();

		
	}

}
