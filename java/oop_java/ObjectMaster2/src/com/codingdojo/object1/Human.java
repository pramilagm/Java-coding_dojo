package com.codingdojo.object1;

public class Human {
	private int strength;
	private int intelligence;
	private int stealth;
	private int health;
	private String name;
	
	public Human(String name) {
		this.strength = 3;
		this.intelligence =3;
		this.stealth =3;
		this.health = 100;
		this.name =name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


	public int getStealth() {
		return stealth;
	}


	public void setStealth(int stealth) {
		this.stealth = stealth;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}

	
	public void attack(Human human) {
		human.setHealth(human.getHealth()-strength);
		System.out.println("The health of " +human.getName() +  "is now decreased by strength " +this.getStrength() +"total health is " +human.getHealth() );
		
	}

	
	
	

}
