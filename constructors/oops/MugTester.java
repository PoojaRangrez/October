package com.xworkz.constructor;

public class MugTester {

	public static void main(String[] args) {
		Mug mug=new Mug("Ceramic","Blue Handle",11.9,200,"StarMugs");
		System.out.println(mug.material);
		System.out.println(mug.style);
		System.out.println(mug.size);
		System.out.println(mug.capacity);
		System.out.println(mug.brand);


	}

}
