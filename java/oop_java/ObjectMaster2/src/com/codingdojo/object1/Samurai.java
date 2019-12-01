package com.codingdojo.object1;

public class Samurai extends Human{
	private int count = 0;
	private int health;
	
	public Samurai(String name) {
		super(name);
		this.health =200;
		this.count += 1;
	}
	
	public void deathBlow(Human KilledHuman) {
		this.health -= this.health/2;
		System.out.println(this.getName()+ " killed the " + KilledHuman.getName() + " and lost the energy by " + this.health/2);
		
	}
	public void meditate() {
		this.health += (this.health/2);
		System.out.println(this.getName()+ " heals itself by " + (this.health/2));
		
	}
	public void howMany() {
		System.out.println("There are " + this.count + " number of samuai");
		
	}
	
	
}
	


