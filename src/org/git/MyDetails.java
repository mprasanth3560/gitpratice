package org.git;

public class MyDetails {
		
	public void name(String name) {
		
		System.out.println("My Name is :"+name);

	}
	
	public void id(int value) {
		System.out.println("My Id :"+value);

	}
	public static void main(String[] args) {
		
		MyDetails md = new MyDetails();
		md.name("krishna");
		md.id(12345);
	}

}
