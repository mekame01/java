package com.kh.c_operator;

import java.util.Scanner;

public class F_삼항연산자 {
	
	//조건식?true일때 연산 또는 값:false일때 연산 또는 값
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F_삼항연산자 test = new F_삼항연산자();
//		test.opTest01();
//		test.quize1();
		test.opTest2();
	}
	
	public void opTest01() {
		int first = 2;
		int second = 3;
		int res = first > second ? first + second : first - second;
		System.out.println("res : " + res);
		
		String result = first>second?"a가 b보다 작다":"a가 b보다 크다";
		System.out.println("result : " + result);
		
	}
	
	//사용자로부터 하나의 문자를 입력받아
	//입력받은 문자가 'y' 또는 'Y'라면 'y를 입력하셨습니다'.
	//입력받은 문자가 'y' 또는 'Y'가 아니라면 '잘못 입력하셨습니다'.
	//를 출력하는 코드를 작성하시오.
	public void quize1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		String str = ch == 'Y' || ch == 'y' ? ch + "를 입력하셨습니다.": "잘못 입력하셨습니다.";
		System.out.println(str);
	}
	
	//사용자로부터 하나의 숫자를 입력받는다.
	//사용자가 입력한 숫자가 0보다 크면 '양수'cnffur
	//0이면 '0'출력
	//0보다 작으면 '음수' 출력
	public void opTest2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int inum = sc.nextInt();
		
		//권장되지 않는 방식 : 가독성이...
		String str = inum > 0 ? "양수" : inum == 0 ? "0" : "음수" ;
		System.out.println(str);
		
	}

}
