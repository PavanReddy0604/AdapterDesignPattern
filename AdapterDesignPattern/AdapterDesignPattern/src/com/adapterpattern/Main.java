package com.adapterpattern;

public class Main {
	
	public static void main(String[] args) {
		
		DistanceAdaptee distanceAdaptee=new DistanceAdapteeImpl(20.4,4);
		DistanceAdaptor distanceAdapter=new DistanceAdapterImpl(distanceAdaptee);
		System.out.println(distanceAdapter.getDistanceInMeters()+" meters");
		
	}
	
	
	

}
