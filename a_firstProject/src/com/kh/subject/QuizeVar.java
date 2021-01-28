package com.kh.subject;

import java.util.Scanner;

public class QuizeVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizeVar quiz = new QuizeVar();
		quiz.example1();
		quiz.example2();
		quiz.example3();
		
	}
	
	public void example1() {
		
		Scanner sc = new Scanner(System.in);
		
		int a1, b1;
		
		//키보드로 정수 두 개를 입력받아,
		System.out.print("첫번째 정수 : ");
		a1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b1 = sc.nextInt();
		
		//두 수의 합, 차, 곱, 나누기한 몫과 나머지 출력
		System.out.println("더하기 결과 : " + (a1 + b1));
		System.out.println("빼기 결과 : " + (a1 - b1));
		System.out.println("곱하기 결과 : " + (a1 * b1));
		System.out.println("나누기한 몫 : " + (a1 / b1));
		System.out.println("나누기한 나머지 : " + (a1 % b1));
	}
	
	public void example2() {
		
		Scanner sc = new Scanner(System.in);
		
		double a2, b2;
		
		//키보드로 가로, 세로 값을 실수형으로 입력받아
		System.out.print("가로 : ");
		a2 = sc.nextDouble();
		System.out.print("세로 : ");
		b2 = sc.nextDouble();
		
		//사각형의 면적과 둘레를 계산하여 출력
		System.out.println("면적 : " + (a2 * b2));
		System.out.println("둘레 : " + (a2 + b2) * 2);
	}
	
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		
		//영어 문자열 값을 키보드로 입력받아
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.next();
		
		//각 자리의 문자를 출력
		System.out.println("첫째 문자 : " + str.charAt(0));
		System.out.println("둘째 문자 : " + str.charAt(1));
		System.out.println("셋째 문자 : " + str.charAt(2));
	}
}
