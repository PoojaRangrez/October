package com.xworkz.constructor;

public class Bank {
	String name;
	String place;
	long contactNum;
	long aadharNum;
	String panCardNum;
	
	Bank(String name,String place,long contactNum,long aadharNum){
		System.out.println("Account created using Aadhar No.");
	}
	
	Bank(String name,String place,long contactNum,String panCardNum){
		System.out.println("Bank Account created successfully using Pan Number");
		this.name=name;
		this.place=place;
		this.contactNum=contactNum;
		this.panCardNum=panCardNum;
	}

}
