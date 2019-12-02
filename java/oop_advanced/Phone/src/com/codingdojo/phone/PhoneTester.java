package com.codingdojo.phone;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("s9",99,"Verizon", "ring ring ring");
		Iphone max10 = new 	Iphone("xs max",99,"Bestbuy","ringgg ringggg ");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		max10.displayInfo();
		System.out.println(max10.ring());
		System.out.println(max10.unlock());
		
	}

}
