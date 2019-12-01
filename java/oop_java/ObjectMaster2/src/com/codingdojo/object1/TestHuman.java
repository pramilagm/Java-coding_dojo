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
		Wizard wiz1 = new Wizard("Pramila");
		Wizard wiz2 = new Wizard("ram");
		Ninja nin1 = new Ninja("kamal");
		Samurai sam1 = new Samurai("lale");
		Samurai sam2 = new Samurai ("kale");
		
		wiz1.heal(ninja);
		wiz2.fireball(samurai);
		nin1.steal(wiz1);
		nin1.runAway();
		sam1.deathBlow(sam2);
		sam1.meditate();
		sam1.howMany();
		
	}

}
