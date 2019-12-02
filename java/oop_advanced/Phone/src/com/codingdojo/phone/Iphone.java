package com.codingdojo.phone;
public  class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring() {
       String ring = getRingTone();
       return ring;
    }
  
    public String unlock() {
    	return "unlocking via facial recognition";
    }
  
    public void displayInfo() {
        System.out.println( "Iphone " + getVersionNumber() + " from " + getCarrier());           
    }

	
    
}

