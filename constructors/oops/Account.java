package com.xworkz.constructor;

public class Account {

	public static void main(String[] args) {
		Bank account=new Bank("Pooja","Vijayanagara",7019303548L,66548297297L);
		
		Bank bank=new Bank("Pooja","Hospet",7019303548L,"CMJ483R0932");
		System.out.println("Name:"+bank.name);
		System.out.println("Place:"+bank.place);
		System.out.println("Phone No."+bank.contactNum);
		System.out.println("Pan:"+bank.panCardNum);

		

	}

}
