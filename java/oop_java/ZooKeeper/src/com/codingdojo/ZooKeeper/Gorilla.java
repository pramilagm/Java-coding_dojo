package com.codingdojo.ZooKeeper;

public class Gorilla extends Mammal {

	public  Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		setEnergy(displayEnergy() - 5);
		
		System.out.println("The Gorarilla has thrown a stone and lose 5 energy now he have total " + energyLevel +"energy");
	}
	public void eatBananas() {
		setEnergy (displayEnergy()+10);
		System.out.println("The Gorilla eat the banana and gain 10 energy now Gorilla Have total " + energyLevel + "energy level");
		
	}
	public void climb() {
		setEnergy (displayEnergy()-10);
		System.out.println("The Gorilla climb the tree and and loose 10 enegry now Gorilla have "+ energyLevel+ "energy level");
		
	}
	

}
