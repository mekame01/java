package com.car;

public class CarTest {

	public static void main(String[] args) {
		// Car type의 객체 배열을 2개 만든다
		Car[] carArr = new Car[2];
		
		// 배열에 사용데이터에서 제공된 2개의 Car 객체를 넣는다.
		carArr[0] = new L3("L3", "1500", 50, 25, 0);
		carArr[1] = new L5("L5", "2000", 75, 35, 0);
		
		// 생성된 자동차의 기본 정보 출력
		printInfo(carArr);
		
		// 각각의 자동차에 25씩 주유 한다
		carArr[0].setOilSize(25);
		carArr[1].setOilSize(25);
		System.out.println("\n 25 주유");
		
		// 25씩 주유한 자동차의 정보를 출력 한다
		printInfo(carArr);
		
		// 각각의 자동차에 80씩 주행 한다
		carArr[0].go(80);
		carArr[1].go(80);
		System.out.println("\n 80 주행");
		
		// 80씩 주행한 정보를 출력 하며 엔진온도 정보를 출력 한다
		printInfo(carArr);
	}
	
	private static void printInfo(Car[] carArr) {
		System.out.printf("%12s%12s%12s%12s%12s%14s\n"
				, "vehicleName", "engineSize", "oilTank"
				, "oilSize", "distance", "temperature");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("%5s%13s%14d%13d%11d%13d\n"
				, carArr[0].getName(), carArr[0].getEngine()
				, carArr[0].getOilTank(), carArr[0].getOilSize()
				, carArr[0].getDistance(), ((L3)carArr[0]).getTempGage());
		System.out.printf("%5s%13s%14d%13d%11d%13d\n"
				, carArr[1].getName(), carArr[1].getEngine()
				, carArr[1].getOilTank(), carArr[1].getOilSize()
				, carArr[1].getDistance(), ((L5)carArr[1]).getTempGage());
	}
}
