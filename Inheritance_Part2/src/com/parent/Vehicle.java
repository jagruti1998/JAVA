package com.parent;

public class Vehicle {
	
	//common properties
	private String engine;  
	private int wheels;
	private int seats;
	private int fuelTank;
//	public String lights;
	private String lights;  //if there is a private entity then that property won't be inherited in child class 
	                        //hence it will give null pointer exception
	public Vehicle() {  //default constructor
		super();
	}


}
