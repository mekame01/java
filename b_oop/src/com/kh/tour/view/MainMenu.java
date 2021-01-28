package com.kh.tour.view;

import java.util.Scanner;

import com.kh.tour.controller.TourController;

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
		
		boolean flg;
		
		do {
			
			System.out.println("\n번호  목적지   가격   마일리지");
			System.out.println(" 1   미국행 300000  3000");
			System.out.println(" 2   중국행 200000  2000");
			System.out.println(" 3   일본행 150000  1500");
			
			System.out.print("목적지 선택(번호입력) : ");
			int input = sc.nextInt();
			
			flg = tc.isAble(input);
			
			if(flg)
			{
				switch (input) {
				case 1: tc.buyTicket1(); break;
				case 2: tc.buyTicket2(); break;
				case 3: tc.buyTicket3(); break;
				}
				
				System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
				System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMile());
			} else {
				System.out.println("현재 보유 금액이 부족합니다.");
			}
			
		}while(flg);
	}
}
