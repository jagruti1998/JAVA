package com.shop;

public class Door {
	private Lock lock; //lock is a custom variable
	public Door() {
		lock = new Lock(true);
		}
	
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("shop is closed,please visit later");
		}
		else
		{
			System.out.println("welcome,we are open!!");
		}
	}
	
	
	
	
	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}




	public class Lock{   //custom class  //this is inner class	
	private boolean lock;  //boolean variable

	public Lock(boolean lock) {  //using this constructor we can assign values as true or false
		this.lock = lock;
	}

	public boolean isLock() {
		return lock;
	}

	public void setLock(boolean lock) {
		this.lock = lock;
	}
		
		
		
		
	}

}
