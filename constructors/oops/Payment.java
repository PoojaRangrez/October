package com.xworkz.constructor;

public class Payment {
	String product;
	int price;
	int cardNum;
	String amount;
	
	Payment(String product,int price,String amount){
		System.out.println("Payment has been done using cash");
	}
	
	Payment(String product,int price,int cardNum){
		System.out.println("Payment has been successfully done by swiping credit card");
	}

}
