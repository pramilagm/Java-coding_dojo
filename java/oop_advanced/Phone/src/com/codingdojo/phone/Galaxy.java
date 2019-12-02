package com.codingdojo.phone;

public  class Galaxy extends Phone implements Ringable {
    
    
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
    	super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	public String ring() {
    	String ring = getRingTone();
    	return ring;
        
    }

    public String unlock() {
    	return "unlocking via finger Prints";
    }
  
    public void displayInfo() {
        System.out.println( "Galaxy" + getVersionNumber() + " from " + getCarrier());           
    }

	
}
