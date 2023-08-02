package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		car.setDoors("closed");
		car.setDriver("seated");
		car.setEngine("on");
		car.setSpeed(100);
		System.out.println(car.run());

	}

}
