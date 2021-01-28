package com.kh.subject;

import java.util.Scanner;

public class QuizeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizeCasting quiz = new QuizeCasting();
		quiz.printUniCode();
		quiz.calculatorScore();;
	}
	
	public void printUniCode() {
		
		Scanner sc = new Scanner(System.in);
		
		//키보드로 문자하나를 입력받아,
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		//그 문자의 유니코드를 출력되게 함
		System.out.println(ch + " is unicode : " + (int)ch);
	}
	
	public void calculatorScore() {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, dsum;
		int isum, avg;
		
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아
		System.out.print("국어 : ");
		a = sc.nextDouble();
		System.out.print("영어 : ");
		b = sc.nextDouble();
		System.out.print("수학 : ");
		c = sc.nextDouble();
		
		//총점과 평균을 계산해서 출력함
		dsum = a + b + c;
		isum = (int)dsum;
		avg =  (int)(dsum / 3.0);
		System.out.println("총점 : " + isum);
		System.out.println("평균 : " + avg);
	}
}
