package com.kh.test;

import java.util.Scanner;

public class A_controllQuize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_controllQuize test = new A_controllQuize();
//		test.quize1();
//		test.quize2();
//		test.quize3();
		test.quize4();

	}
	
	public void quize1() {
		//사용자로부터 점수를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요 : ");
		int score = sc.nextInt();
		String str = "F";
		
		if(score >= 90)
		{
			str = "A";
		}
		else if(score >= 80)
		{
			str = "B";
		}
		else if(score >= 70)
		{
			str = "C";
		}
		else if(score >= 60)
		{
			str = "D";
		}
		
		if(score >= 60 && score % 10 >= 5)
		{
			str += "+";
		}
		//점수와 등급을 표시하시오.
		System.out.println("점수 : " + score + " / 등급 : " + str);
	}
	
	public void quize2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원등급을 입력해 주세요(dia/gold/silver/bronze). : ");
		String str = sc.next();
		
		String str2 = "\n다이아쿠폰 발급";
		String str3 = "\n50% 할인쿠폰 발급";
		String str4 = "\n영화티켓 2매 쿠폰 발급";
		String str5 = "\n20% 할인쿠폰 발급";
		
		System.out.println("회원등급 : " + str);
		
		if(str.equals("dia"))
		{
			System.out.println(str2 + str3 + str4 + str5);
		}
		else if(str.equals("gold"))
		{
			System.out.println(str3 + str4 + str5);
		}
		else if(str.equals("silver"))
		{
			System.out.println(str5 + str4);
		}
		else if(str.equals("bronze"))
		{
			System.out.println(str5);
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void quize3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원등급을 입력해 주세요(dia/gold/silver/bronze). : ");
		String str = sc.next();
		
		System.out.println("회원등급 : " + str);
		
		switch (str) {
		//주의사항! : switch-case에서 break;는 작성하는 것이 원칙
		//			만약 작성하지 않았다면 주석으로 남겨놓아야한다.
		case "dia": System.out.println("다이아쿠폰 발급");
		case "gold": System.out.println("50% 할인쿠폰 발급");
		case "silver": System.out.println("영화티켓 2매 쿠폰 발급");
		case "bronze": System.out.println("20% 할인쿠폰 발급"); break;
		default: System.out.println("정확한 등급명을 작성해주세요.");
		
		}
	}
	
	public void quize4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호 입력 : ");
		int inum = sc.nextInt();
		
		switch (inum) {
		case 1: System.out.println("입력메뉴가 선택되었습니다."); break;
		case 2: System.out.println("수정메뉴가 선택되었습니다."); break;
		case 3: System.out.println("조회메뉴가 선택되었습니다."); break;
		case 4: System.out.println("삭제메뉴가 선택되었습니다."); break;
		case 7: System.out.println("프로그램이 종료됩니다."); break;
		default: System.out.println("번호를 잘못 입력하셨습니다.");
		}
	}
}
