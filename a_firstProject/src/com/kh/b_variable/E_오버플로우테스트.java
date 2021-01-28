package com.kh.b_variable;

public class E_오버플로우테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E_오버플로우테스트 test = new E_오버플로우테스트();
		test.testOverFlow();

	}
	
	public void testOverFlow() {
		
		byte bnum = 127;
		
		//byte 또는 short는 연산(+ - * / %)을 실행하면 int가 된다.
		System.out.println("bnum : " + bnum);
		System.out.println("bnum : " + Integer.toBinaryString(bnum));
		
		bnum = (byte)(bnum + 1);
		System.out.println("bnum : " + bnum);
		//Integer.toBinaryString() : Integer 클래스의 메서드로 
		//10진수를 넣으면 10진수를 2진수로 변환한 형태의 문자열을 반환해준다.
		System.out.println("bnum : " + Integer.toBinaryString(bnum));
	}

}
