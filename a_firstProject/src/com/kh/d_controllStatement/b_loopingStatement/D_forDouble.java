package com.kh.d_controllStatement.b_loopingStatement;

import java.util.Scanner;

public class D_forDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_forDouble test = new D_forDouble();
//		test.testForDouble();
//		test.quizeForDouble();
//		test.quizeForDouble2();
//		test.quizeDouble3();
//		test.quizeDouble3_2();
//		test.quizeDouble3_3();
		test.printStar2();
	}
	
	public void testForDouble() {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("몇번 반복될까? " + j);
			}
			System.out.println("=============================");
		}
		
	}
	
	//2중 for문으로 구구단
	//2단~9단까지 출력해보기
	public void quizeForDouble() {
		for(int i = 2; i < 10; i++) {
			System.out.println("========== " + i + "단 ==========");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
	
	//사용자로부터 다운로드 받을 프로그램 개수를 입력받아
	//다운로드 진행창을 출력하시오.
	
	//사용자로부터 다운로드 받을 프로그램의 개수 입력받는다.
	//[출력양식]
	//n번째 프로그램 다운로드 받습니다.
	//0% 진행중...
	//20% 진행중...
	//40% 진행중...
	//60% 진행중...
	//80% 진행중...
	//100% 진행중...
	//n번째 프로그램 다운로드 완료되었습니다.
	//--------------------------------
	//모든 프로그램 다운로드 완료
	
	public void quizeForDouble2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("다운로드 받을 프로그램 개수 : ");
		int i = sc.nextInt();
		
		for(int j = 0; j <= i; j++) {
			System.out.println((j + 1) + "번째 프로그램 다운로드 받습니다.");
			for(int k = 0; k < 101; k += 20) {
				System.out.println(k + "% 진행중...");
			}
			System.out.println(j + "번째 프로그램 다운로드 완료되었습니다.");
			System.out.println("==============================");
		}
		System.out.println("------------------------------");
		System.out.println("모든 프로그램 다운로드 완료");
	}
	
	//사용자로부터 줄 수와 칸 수를 입력받아서
	//사각형을 별로 그리는 이중반복문 작성하시오
	public void quizeDouble3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int i1 = sc.nextInt();
		System.out.print("칸 수 : ");
		int i2 = sc.nextInt();
		
		for(int i = 0; i < i1; i++) {
			for(int j = 0; j < i2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//사용자로부터 정수를 하나 입력받아 
	//사각형을 별로 그리는데, 대각선에는 숫자를 출력하시오.
	//숫자는 1~사용자가 입력한 숫자까지
	public void quizeDouble3_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int i1 = sc.nextInt();
		
		for(int i = 0; i < i1; i++)	{
			for(int j = 0; j < i1; j++)
				if(j == i)	{
					System.out.print(j+1);
				} else {
					System.out.print("*");
				}
			System.out.println();
		}
	}
	
	public void quizeDouble3_3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int i1 = sc.nextInt();
		
		for(int i = 0; i < i1; i++) {
			for(int j = 0; j < i1; j++) {
				if(j == i) {
					System.out.println(j + 1);
					break;
				} else {
					System.out.print("*");
				}
			}
		}
		
	}
	
	public void printStar2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int row = sc.nextInt();
		if(row > 0) {
			for(int i = 1; i <= row; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(row < 0) {
			
			for(int i = 0; i < -row; i++) {
				for(int j = 0; j < -row - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			/*
			for(int i = 0; i > row; i--) {
				for(int j = 0; j > row - i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			*/
		} else {
			System.out.println("출력 기능이 없습니다.");
		}
	}
}
