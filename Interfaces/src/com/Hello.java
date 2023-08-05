package com;

public class Hello {
	public static void main(String[] args) {
		
		Phone phone = new OnePlus();
		Phone phone1 = new Iphone14();

		System.out.println("Processor: "+phone.processor()); //this will return string
		System.out.println("Processor: "+phone1.processor()); //this will return string
		System.out.println("Space in GB: "+phone.spaceInGb()); //this will return string


}
}