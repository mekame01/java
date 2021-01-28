package com.car;

public class L3 extends Car implements Temp{

	public L3() {
		
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}

	public void go(int distance) {
		super.go(distance);
		super.setOilSize( - (distance / 10));
	}
	
	public void setOilSize(int oilSize) {
		super.setOilSize(oilSize);
	}
	
	@Override
	public int getTempGage() {
		return super.getDistance() / 10;
	}
	
}
