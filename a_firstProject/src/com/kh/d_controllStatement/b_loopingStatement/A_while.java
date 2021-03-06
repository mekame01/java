package com.kh.d_controllStatement.b_loopingStatement;

import java.util.Scanner;

public class A_while {
	
	//[표현식]
	//while(조건식){실행코드}
	//조건식이 참이면 실행코드를 반복수행하고
	//조건식이 거짓이면 실행코드를 무시한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_while test = new A_while();
//		test.testWhile();
//		test.testWhile2();
//		test.testWhile3();
		test.quize2();
	}
	
	public void testWhile() {
		while (true) {
			System.out.println("무한반복문 출동!");
		}
	}
	
	//다섯번만 동작하는 while문 만들기
	public void testWhile2() {
		
		int i = 0;
		while(i < 5) {
			System.out.println(i + 1+ "번 수행하였습니다.");
			i++;
		}
		
	}
	
	//정수를 하나 입력받아, 정수가 1~9 사이의 숫자라면 그 수의 구구단을 출력하고
	//정수가 1~9를 벗어나는 숫자라면 "1~9사이의 숫자를 입력하세요" 출력
	public void testWhile3() {
		//사용자로부터 정수를 하나 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력해 주세요 : ");
		int i = sc.nextInt();
		
		//정수가 1~9사이의 숫자라면
		if(i > 0 && i < 10) {
			int i2 = 1;
			//구구단을 출력
			while(i2 < 10)	{
				System.out.println(i + " * " + i2 + " = " + i * i2 );
				i2++;
			}
		}
		//아니라면
		else {
			//"1~9사이의 숫자를 입력하세요" 출력
			System.out.println("1~9사이의 숫자를 입력하세요");
		}
	}
	
	//사용자로부터 비밀번호를 입력받아서
	//비밀번호가 일치하면 "로그인에 성공하였습니다."를 출력하고 반복문을 종료
	//비밀번호가 일치하지 않으면 "비밀번호가 틀렸습니다."를 출력하고 다시 비밀번호를
	//입력받을 수 있도록 한다.
	//비밀번호를 5회 틀리게 되면 "비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다."
	//라고 출력하고 반복문을 종료한다.
	// * 비밀번호 : 12345
	public void quize2() {
		Scanner sc = new Scanner(System.in);
		
		int tryCnt = 1;
		boolean flg = true;
		
		while(flg)
		{
			System.out.print("비밀번호를 입력해 주세요 : ");
			String pswd = sc.next();
			
			if(pswd.equals("12345")) {
				System.out.println("로그인에 성공하였습니다.");
				flg = false;
			} else {
				System.out.println("비밀번호가 틀렸습니다. " + tryCnt + "회 오류");
				tryCnt++;
			}
			
			if(tryCnt > 5)
			{
				System.out.println("비밀번호를 5회 잘못 입력하여 프로그램을 종료합니다.");
				flg = false;
			}
		}
		
	}

}
