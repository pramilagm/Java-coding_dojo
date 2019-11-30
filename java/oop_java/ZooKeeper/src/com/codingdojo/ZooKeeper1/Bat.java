package com.codingdojo.ZooKeeper1;
import com.codingdojo.ZooKeeper.*;


public class Bat extends Mammal {

	public Bat() {
		super(300);
	}
	

	public void fly() {
		setEnergy(displayEnergy()-50);
		System.out.println("The bat make a ping and clicks sound while taking off and lose 50 enery The total energy left is"
				+ energyLevel);
	}
	public void eatHumans() {
		setEnergy(displayEnergy()+25);
		System.out.println("The bat eat the human and gain 25 energy total energy now  is "+ energyLevel );
	}
	public void attackTown() {
		setEnergy(displayEnergy()-100);
		System.out.println("The gorilla has attack the town and lost  100 energy total energy left is" + energyLevel);
	}

	
	
	
	

}
