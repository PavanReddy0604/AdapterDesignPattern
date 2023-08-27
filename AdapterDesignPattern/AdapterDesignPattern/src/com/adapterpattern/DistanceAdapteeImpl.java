package com.adapterpattern;

public class DistanceAdapteeImpl implements DistanceAdaptee {
	
	private double speed;
	private double time;
	
	

	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public double getTime() {
		return time;
	}



	public void setTime(double time) {
		this.time = time;
	}



	public DistanceAdapteeImpl(double speed, double time) {
		super();
		this.speed = speed;
		this.time = time;
	}



	public DistanceAdapteeImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public double getDistanceInKiloMeter() {
		// TODO Auto-generated method stub
		return this.speed*this.time;
	}

}
