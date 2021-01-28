package com.kh.d_controllStatement.b_loopingStatement;

import java.util.Scanner;

public class C_for {
	//[표현식]
	//for(초기식;조건식;증감식){실행코드}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_for test = new C_for();
//		test.testFor();
		test.quiz();
	}
	
	public void testFor() {
		for(int i = 0; i < 5; i++) {
			System.out.println("5회 반복되는 반복문입니다. " + i);
		}
	}
	
	//사용자로부터 정수하나를 입력받아
	//정수가 1~9사이의 숫자라면 그 수의 구구단을 출력하시오.
	//아니라면 "1~9사이의 숫자를 입력해야합니다."를 출력
	public void quiz() {
		//사용자로부터 정수 하나 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력해 주세요 : ");
		int i1 = sc.nextInt();
		
		if(i1 > 0 && i1 < 10) {
			for(int i2 = 1; i2 < 10; i2++) {
				System.out.println(i1 + " * " + i2 + " = " + (i1 * i2));
			}
		}
		else {
			System.out.println("1~9사이의 숫자를 입력해야합니다.");
		}
	}
}
