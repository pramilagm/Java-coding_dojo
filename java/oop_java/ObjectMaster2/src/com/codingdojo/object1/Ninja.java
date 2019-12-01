package com.codingdojo.object1;

public class Ninja extends Human{
	private int stealth;

	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void steal(Human human) {
		
		System.out.println("the total health is" +human.getHealth());
		human.setHealth(human.getHealth() - this.getStealth());
		System.out.println(human.getName() + " health is stolen by "+this.getName() + " by " + this.stealth + "total health of "+human.getName() +
				" " + this.getHealth());
		this.setStealth(this.getStealth()*2);
		System.out.println(this.getName() + " health is increased by " + this.stealth + "with total health " +this.getHealth());
		
		
	}
	
	public void runAway() {
		this.setHealth(this.getHealth()-10); 
		System.out.println("the total health is " +this.getHealth());
		
	}

}
