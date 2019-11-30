package com.codingdojo.ZooKeeper;

public class Mammal {
	protected int energyLevel;
	

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println(" The energy of Mammal is" +energyLevel);
		return energyLevel;
	}

	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
		
	}
	

}
