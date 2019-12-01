package com.codingdojo.object1;

public class TestHuman {
	public static void main(String[] args) {
		Human wizard = new Human("pramila");
		Human ninja =new Human("Cris");
		Human samurai = new Human("Iris");
		wizard.attack(ninja);
		ninja.attack(samurai);
		samurai.attack(wizard);
		ninja.attack(wizard);
		ninja.attack(wizard);
		
	}

}
