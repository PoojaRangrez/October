package com.xworkz.constructor;

public class Registration {
	String name;
	long contactNum;
	String emailId;
	
	Registration(String name,long contactNum){
		System.out.println("Successfully registered using contact No.");
		this.name=name;
		this.contactNum=contactNum;
		
	}
	Registration(String name,String emailId){
		System.out.println("Successfully registered using Email Address");
		
	}
	

}
