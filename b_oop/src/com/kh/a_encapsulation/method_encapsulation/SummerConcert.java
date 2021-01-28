package com.kh.a_encapsulation.method_encapsulation;

public class SummerConcert {
	
	public void startConcert() {
		
		System.out.println("여름 콘서트 시작합니다!!!");
		System.out.println("연주자가 무대로 올라옵니다.");
		
		//연주를 위해 연주자 클래스를 인스턴스화해서
		//연주를 위한 메드드를 호출
		//연주 시작 -> 연주 진행 -> 연주 끝
		Player player = new Player();
		player.startPlay();
		
		System.out.println("여름 콘서트 끝났습니다.");
	}
}
