package com.adapterpattern;

public class DistanceAdapterImpl implements DistanceAdaptor{
	
	DistanceAdaptee distanceAdapterImpl;
	
	

	public DistanceAdapterImpl(DistanceAdaptee distanceAdapterImpl) {
		super();
		this.distanceAdapterImpl = distanceAdapterImpl;
	}



	@Override
	public double getDistanceInMeters() {
		
		double distancecInMeters=this.distanceAdapterImpl.getDistanceInKiloMeter()*1000;
		return distancecInMeters;
	}

}
