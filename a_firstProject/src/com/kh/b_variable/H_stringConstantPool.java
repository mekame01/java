package com.kh.b_variable;

import java.util.Scanner;

public class H_stringConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("\"가\"를 입력해 주세요 : ");
		String zeroStr = sc.next();
		
		//리터럴로 초기화 -> 스트링 상수풀을 탐색한 후에 존재하지 않으면 스트링 상수풀에 값을 저장
		String firstStr = "가";
		String secondStr = "가";
		//스트링 상수풀 탐색하지 않고 heap영역에 값을 저장
		String thirdStr = new String("가");
		
		System.out.println("zeroStr 메모리주소 : " + System.identityHashCode(zeroStr));
		System.out.println("firstStr 메모리주소 : " + System.identityHashCode(firstStr));
		System.out.println("secondStr 메모리주소 : " + System.identityHashCode(secondStr));
		System.out.println("thirdStr 메모리주소 : " + System.identityHashCode(thirdStr));

		System.out.println("\"가\" 메모리주소 : " + System.identityHashCode("가"));
		
		System.out.println(firstStr == secondStr);	//true
		System.out.println(secondStr == thirdStr);	//false
		System.out.println(secondStr.equals(thirdStr));	//true
		
	}

}
