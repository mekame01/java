package com.kh.f_array.util;

import java.util.Arrays;

public class B_arrayPrac {
	//[문제]
	//크기가 10인 int[]을 선언, 할당하고
	//1~100 사이의 임의의 정수를 발생시켜, 배열 공간에 기록하시오
	//기록된 10개의 값 중 가장 큰 값과 가장 작은 값을 알아내어
	//[출력양식] min : 1, max : 100 과 같은 형식으로 출력하시오.
	//메서드명 : test1
	//hint : Math클래스의 random 메서드를 활용하면 임의의 정수를 발생시킬 수 있다.
	public void test1() {
		
		//java.lang.Math.random() : 0보다 크거나 같고 1보다는 작은 임의의 실수를 반환하는 메서드
		//							0 ~ 0.9999999 실수를 반환한다.
		//			random메서드의 반환값에 정수를 곱하고 int 캐스팅하면 0 ~ 곱한 정수 - 1 사이의 값이 된다.
		//			* double 타입의 값을 int타입으로 강제 캐스팅하면 소수점 아래의 수는 모두 버려지게 된다.
		//			ex) 0 ~ 99.999999999 사이의 값은 0~99 사이의 정수가 된다.
		
		//크기가 10인 정수배열을 선언하고 할당
		int[] iArr = new int[10];
		int tmp = 0;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(iArr.hashCode());
		System.out.println(Arrays.toString(iArr));
		//문제를 해결하기 위해 미리 만들어 둔 혹은 남들이 만든 메서드를 적극 활용하자.
		//오름차순 정렬
		new ArrayUtil().sort(iArr);
		System.out.println(iArr.hashCode());
		System.out.println(Arrays.toString(iArr));
		//가장 작은 값 : 인덱스 0 / 가장 큰 값 : 마지막 인덱스
		System.out.println("min : " + iArr[0] + ", max : " + iArr[iArr.length-1]);
	}
	
	//크기가 10인 int[]를 3개 생성하세요.
	//각 int[]을 1~95 사이의 임의의 수로 초기화 하세요.
	//3개 int[]에 들어있는 숫자들 중에서 7,8,9번째로 작은 수를 구하세요
	//ex) [1,2,3,3] [4,5,5,6] [6,6,8,9]
	//[출력양식]	7번째 : 5
	//			8번째 : 6
	//			9번째 : 6
	
	public void test2() {
		//크기가 10인 int[] 3개 생성
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[10];
		
		ArrayUtil util = new ArrayUtil();
		//각 배열을 1~95 사이의 임의의 수로 초기화
		for(int i = 0; i < 10; i++) {
			iArr1[i] = (int)(Math.random() * 95) + 1;
			iArr2[i] = (int)(Math.random() * 95) + 1;
			iArr3[i] = (int)(Math.random() * 95) + 1;
		}
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		
		//각각의 배열에 들어있는 숫자들 중 7,8,9번째로 작은 수를 구하기 위해
		//3개의 배열을 하나의 배열로 합친다.
		int[] resArr = util.addAll(util.addAll(iArr1, iArr2), iArr3);
		//합쳐진 하나의 배열을 오름차순으로 정렬
		util.sort(resArr);
		
		System.out.println(resArr.hashCode());
		System.out.println(Arrays.toString(resArr));
		
		//6번 인덱스 -> 7번째로 작은 숫자
		System.out.println("7번째 : " + resArr[6]);
		//7번 인덱스 -> 8번째로 작은 숫자
		System.out.println("8번째 : " + resArr[7]);
		//8번 인덱스 -> 9번째로 작은 숫자
		System.out.println("9번째 : " + resArr[8]);
	}
	
}
