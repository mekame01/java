package com.kh.e_method;

public class D_static {
	
	//접근제한자 [예약어] 반환형 메서드명(매개변수)
	
	//static
	//메서드나 변수 앞에 static 예약어를 붙여주면 프로그램이 실행되자마자 static영역으로 올라가
	//프로그램이 종료될 때까지 메모리에서 내려오지 않는다.
	//그래서 참조형 변수를 선언하고 초기화하는 과정 없이도, 메서드를 호출할 수 있다.
	//사용법 : 클래스명(타입명).메서드명()
	
	//필드변수
	//멤버변수
	String noneStatic = "Static 아님";
	//클래스변수
	static String staticName = "하명도";
	
	//일반 메서드
	public void methodTest() {
		System.out.println("일반 메서드 입니다.");
	}
	
	//Static 메서드
	public static void staticTest() {
		System.out.println("Static 메서드 입니다.");
	}
}
