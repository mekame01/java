package com.kh.tour_refactoring.view;

import java.util.Scanner;

import com.kh.tour_refactoring.controller.TourController;


public class MainMenu {
	Scanner sc = new Scanner(System.in);
	TourController tc = new TourController();
	
	{
		//환영문구 출력
		System.out.println("******KH항공사에 오신 고객님 환영합니다******");
	}
	
	public MainMenu() {
		
	}
	
	public void mainMenu() {
		System.out.println("현재 보유 금액 : " + tc.bringMyMoney());
		System.out.println("현재 보유 마일리지 : " + tc.bringMyMile());
		
		boolean flg = true;
		
		while(flg) {
			
			System.out.println("\n번호  목적지   가격   마일리지");
			System.out.println(" 1   미국행 300000  3000");
			System.out.println(" 2   중국행 200000  2000");
			System.out.println(" 3   일본행 150000  1500");
			
			System.out.print("목적지 선택(번호입력) : ");
			int input = sc.nextInt();
			
			if(input < 1 || input > 3) {
				System.out.println("번호를 잘못 입력하셨습니다.");
				continue;
			}
			
			flg = tc.isAble(input);
			
			if(flg)
			{
				tc.buyTicket(input);
				
				System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
				System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMile());
			} else {
				System.out.println("현재 보유 금액이 부족합니다.");
			}
			
		}
	}
}
