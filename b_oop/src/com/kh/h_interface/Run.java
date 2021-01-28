package com.kh.h_interface;

public class Run {

	public static void main(String[] args) {
		
		//1. SmartPhone클래스는 BatteryDetachable 인터페이스를 구현하였기 때문에
		//	BatteryDetachable 타입으로 사용가능
		BatteryDetachable smartPhone
		= new SmartPhone("사과", "아이폰", 1400000, "긱벤치", 8, "SK");
		
		//인터페이스로부터 물려받아 오버라이드한 메서드
		smartPhone.attachBattery();
		smartPhone.detachBattery();
		
		//인터페이스의 default메서드
		smartPhone.info();
	}

}
