package com.car;

public class L5 extends Car implements Temp{

	public L5() {
		
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
		// TODO Auto-generated constructor stub
	}
	
	public void go(int distance) {
		super.go(distance);
		super.setOilSize( - (distance / 8));
	}
	
	public void setOilSize(int oilSize) {
		super.setOilSize(oilSize);
	}

	@Override
	public int getTempGage() {
		return super.getDistance() / 5;
	}
}
