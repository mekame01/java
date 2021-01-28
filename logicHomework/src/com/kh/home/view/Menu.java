package com.kh.home.view;

import java.util.Scanner;

import com.kh.home.controller.Function;

public class Menu {

	public static void displayMenu(){
		Scanner sc = new Scanner(System.in);
		Function f = new Function();
		
		int input;
		do {
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합게 구하기");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			input = sc.nextInt();
			
			switch (input) {
			case 1: f.calculator(); break;
			case 2: f.totalCalculator(); break;
			case 3: f.profile(); break;
			case 4: f.sungjuk(); break;
			case 5: f.printStarNumber(); break;
			case 6: f.sumRandomNumber(); break;
			case 7: f.continueGugudan(); break;
			case 8: f.shutNumber(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못 입력하였습니다.");
			}
		} while(input != 9);
	}
	
}
