package com.xworkz.constructor;

public class Mug {
	String material;
	String style;
	double size;
	int capacity;
	String brand;
	
	public Mug(){
		System.out.println("Inside no arguments");
	}
	
	public Mug(String material,double size,String brand){
		System.out.println("Inside 3 arguments");
		this.material=material;
		this.size=size;
		this.brand=brand;
	}
	
	Mug(String material,String style,double size,int capacity,String brand){
		System.out.println("Mug Construcrtor Invoked");
		this.material=material;
		this.style=style;
		this.size=size;
		this.capacity=capacity;
		this.brand=brand;
	}
	public void drink() {
		System.out.println(this.brand+"Used for drinking hot drinks");
	}
	public void capacity() {
		System.out.println("Capacity of mug is more than cup");
	}
	public void heat() {
		System.out.println(this.brand+"Retain heat much longer");
	}
	

}



