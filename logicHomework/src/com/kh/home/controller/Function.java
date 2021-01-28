package com.kh.home.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	
	public void calculator() {
		//1. 정수 두 개와 연산문자 하나를 키보드로 입력받음
		//2. 두 정수값은 int 변수에 저장
		//3. 연산문자는 char 변수에 저장
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산문자 : ");
		char c = sc.next().charAt(0);
		int result = 0;
		
		//4. switch 문 사용
		switch (c) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': 
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				result = 0;
			} else {
				result = num1 / num2;
			}
			break;
		default: System.out.println("연산문자를 잘못 입력하셨습니다."); return;
		}
		System.out.println(num1 + " " + c + " " + num2 + " = " + result);
	}
	
	public void totalCalculator(){
		//1. 키보드로 두 개의 정수를 입력받음
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		//2. 두 정수중 작은 값을 시작값으로,
	    //큰 값을 종료값으로 사용함
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1; i <= num2; i++) {
			//3. 작은값에서 큰값까지 정수의 합계를 구함
			sum += i;
		}
		
		System.out.println(num1 + "부터 " + num2 + "까지 정수들의 합계 : " + sum);
	}
	
	public void profile(){
		//신상정보들을 자료형에 맞춰 변수에 기록하고,
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		String sex = sc.next();
		System.out.print("성격 : ");
		String personality = sc.next();
		
		//변수에 기록된 값을 출력 확인함.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("성격 : " + personality);
	}
	
	public void sungjuk() {
		//변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("반 : ");
		int ban = sc.nextInt();
		System.out.print("번호 : ");
		int number = sc.nextInt();
		System.out.print("성별 : ");
		char sex = sc.next().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(year + "학년 " + ban + "반 " + number + "번 "
				+ (sex=='M'?"남학생 ":"여학생 ") + name + "의 점수는 "
				+ score + "이고, " + grade + " 학점입니다.");
	}
	
	public void printStarNumber(){
		//정수를 하나 입력받아
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		//그 수가 양수일 때만
		if(num > 0) {
			for(int i = 0; i < num; i++) {
				for( int j = 0; j <= i; j++) {
					if(i == j) {
						System.out.print(j + 1);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandomNumber() {
		//1~100 사이의 정수중 임의의 정수를 하나 발생시켜(Math.random())
		int num = (int)(100 * Math.random()) + 1;
		int sum = 0;
		//1부터 발생된 정수까지의 합계를 구하여 출력함
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합계 : " + sum);
	}
	
	public void continueGugudan(){
		//정수를 하나 입력받아, 그 수가 양수일 때만 그 수의 구구단이 출력되게 함.
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("단수 : " + num);
			System.out.println("제외할 배수 : " + (num * num));
			for(int i = 1; i <= 9; i++) {
				//단, 곱하기 결과가 입력받은 정수의 배수인 값을 출력에서 제외함.
				if(i % num == 0) {
					continue;
				} else {
					System.out.println(num + " * " + i + " = " + (num * i));
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void shutNumber(){
		boolean flg = true;
		
		do {
			char input;
			
			//1. 두 개의 주사위가 만들어 낼 수 있는 모든 경우의 수중(random)
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			
			System.out.print("정수 하나 입력 (2~12): ");
			int num = sc.nextInt();
			
			//2. 두 주사위 눈의 합이 입력된 수와 같은 경우 "맞췄습니다." 출력
			if(num == num1 + num2) {
				System.out.println("맞췄습니다.");
			} else {
				//3. 입력값과 다르면 "틀렸습니다." 출력함.
				System.out.println("틀렸습니다.");
			}
			
			System.out.print("계속하시겠습니까?(y/n) : ");
			input = sc.next().charAt(0);
			if(input == 'n' || input == 'N') {
				flg = false;
			}
		} while(flg);
		
	}
}
