package com.kh.training.view;

import java.util.Scanner;

import com.kh.trianing.controller.TrainingManager;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	
	public MainMenu() {
		
	}
	
	public void mainMenu() {
		System.out.print("관리할 훈력샌 숫자 : ");
		TrainingManager tm = new TrainingManager(sc.nextInt());
		
		while(true) {
			
			System.out.println("====== 메뉴 ======");
			System.out.println("1. 훈련생 추가");
			System.out.println("2. 훈련생 전체 조회");
			System.out.println("3. 훈련생 이름으로 검색");
			System.out.println("9. 프로그램 종료");
			// 사용자의 입력에 따라 TrainingManager의 메소드 호출
			//또는 프로그램 종료
			System.out.print("메뉴 번호 입력 : ");
			switch (sc.nextInt()) {
			case 1: tm.insertTrainees(); break;
			case 2: tm.printTrainees(); break;
			case 3: tm.searchTrainees(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
