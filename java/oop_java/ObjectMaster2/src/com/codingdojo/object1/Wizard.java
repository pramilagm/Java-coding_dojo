package com.codingdojo.object1;

public class Wizard extends Human {
	private int health;
	private int intelligence;
	

	public Wizard(String name) {
		super(name);
		this.health=50;
		this.intelligence=8;
	}




	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void heal(Human target) {
		System.out.println(this.getName()+ " heals the  the " + target.getName() + " by its "+this.getIntelligence() +" intelligence");
		target.setHealth(target.getHealth() + this.intelligence);
	}
	public void fireball(Human target) {
		target.setHealth(target.getHealth() + this.intelligence*3);
		System.out.println(this.getName() + " decreses the health of " + target.getName()+ " by "+ this.intelligence*3  );
		
		System.out.println("the total health of " + target.getName() +" is " + target.getHealth());
	}


																																							

}
