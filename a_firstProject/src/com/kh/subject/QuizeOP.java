package com.kh.subject;

import java.util.Scanner;

public class QuizeOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizeOP quiz = new QuizeOP();
		quiz.sample1();
		quiz.sample2();
		quiz.sample3();
		quiz.sample4();

	}
	
	public void sample1() {
		
		Scanner sc = new Scanner(System.in);
		
		//국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
		int kor, eng, math, sum;
		double avg;
		
		//각 점수를 키보드로 입력받고,
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		//합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		/*
		세 과목의 점수와 평균을 가지고 합격 여부 처리함
		합격의 조건 : 세 과목의 점수가 각각 40점이상이면서,
					평균이 60점 이상이면 합격, 
					아니면 불합격 처리함
		*/
		if((kor >= 40 && eng >= 40 && math >= 40) && avg >= 60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
		
	}
	
	public void sample2() {
		
		Scanner sc = new Scanner(System.in);
		
		//변수 선언하고,
		String str1, str2;			//학생이름, 성별
		int inum1, inum2, inum3;	//학년, 반, 번호
		char ch;					//성별
		double dnum;				//성적
		
		//키보드로 입력받은 값들을 변수에 기록하고
		System.out.print("학생이름 : ");
		str1 = sc.next();
		System.out.print("학년 : ");
		inum1 = sc.nextInt();
		System.out.print("반 : ");
		inum2 = sc.nextInt();
		System.out.print("번호 : ");
		inum3 = sc.nextInt();
		System.out.print("성별 : ");
		ch = sc.next().charAt(0);
		System.out.print("성적(실수) : ");
		dnum = sc.nextDouble();
		
		//성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함
		if(ch == 'M' || ch == 'm')
		{
			str2 = "남학생 ";
		}
		else
		{
			str2 = "여학생 ";
		}
		
		//출력
		System.out.println(inum1 + "학년 " + inum2 + "반 " + inum3 + "번 " + str2 + str1 + "은 성적이 " + dnum + "이다.");
	}
	
	public void sample3() {
		
		Scanner sc = new Scanner(System.in);
		
		int inum;	//1. 정수 변수 선언
		
		//2. 키보드로 부터 정수 하나 입력받음
		System.out.print("정수를 입력해 주세요 : ");
		inum = sc.nextInt();
		
		//3. 입력받은 정수가 양수이면 "양수다." 출력
		//양수가 아니면 "양수가 아니다." 출력
		if(inum > 0)
		{
			System.out.println("양수다.");
		}
		else
		{
			System.out.println("양수가 아니다.");
		}
	}
	
	public void sample4() {
		
		Scanner sc = new Scanner(System.in);
		
		int inum;	//1. 정수 변수 선언
		String str;	//2. 문자열 변수 선언
		
		//3. 키보드로 부터 정수를 하나 입력 받음
		System.out.print("정수를 입력해 주세요 : ");
		inum = sc.nextInt();
		
		// 4. 입력받은 정수가 짝수이면 "짝수다" 를 문자열변수에 기록하고,
		//    짝수가 아니면 "홀수다"를 문자열변수에 기록하고 
		if(inum % 2 == 0)
		{
			str = "짝수다";
		}
		else
		{
			str = "홀수다";
		}
		
		//    문자열변수 값 출력함
		System.out.println(str);
	}
	
}
