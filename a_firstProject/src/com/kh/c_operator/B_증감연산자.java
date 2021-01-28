package com.kh.c_operator;

public class B_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B_증감연산자 test = new B_증감연산자();
		test.test1();
		
		
	}
	
	public void test1()
	{
		//증감연산자는 값을 1씩 증가 시키거나 감소 시킨다.
		// ++ : 1 증가, -- : 1 감소
		//전위연산자(++변수) : 계산(출력, 연산, 대입)을 처리하기 전에 증감
		//후위연산자(변수++) : 계산을 먼저 처리하고 증가나 감소가 발생한다.
		
		int firstNum = 10;
		int secondNum = 100;
		
		++firstNum;
		System.out.println("++firstNum의 결과는? " + firstNum);
		firstNum++;
		System.out.println("firstNum++의 결과는? " + firstNum);
		
		//출력문 안에서 전위연산자 사용
		System.out.println("--firstNum의 결과는? " + --firstNum);
		System.out.println("firstNum--의 결과는? " + firstNum--);
		System.out.println("firstNum의 결과는? " + firstNum);
		System.out.println("quiz? " + --firstNum);
		
		System.out.println("========================================");
		firstNum = 10;
		secondNum = 100;
		System.out.println("firstNum + secondNum = " + (firstNum + secondNum));
		System.out.println("++firstNum + secondNum = " + (++firstNum + secondNum));
		System.out.println("firstNum + --secondNum = " + (firstNum + --secondNum));
		System.out.println("firstNum + secondNum-- = " + (firstNum + secondNum--));
		System.out.println("firstNum : " + firstNum + " secondNum : " + secondNum);
	}

}
