package com.kh.f_array;

import java.util.Arrays;

import com.kh.f_array.study.A_array;
import com.kh.f_array.util.ArrayUtil;
import com.kh.f_array.util.B_arrayPrac;
import com.kh.g_dimensionArray.DimensionArray;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_array test = new A_array();
		ArrayUtil test2 = new ArrayUtil();
//		test.testArray();
//		test.testArray2();
//		test.testArray3();
//		test.testArray4();
//		test.testArray5();
//		test.testArray6();
//		test.testArray7();
//		test.quizeArray();
		ArrayUtil util = new ArrayUtil();
		
		int[] testArr = {1,2,3,4,5}; 
//		System.out.println(testArr.hashCode());
		
		//add 메서드의 결과로 반환되는 새로운 배열의 주소를 testArr 변수에 담아준다.
//		testArr = util.add(testArr, 10);
//		System.out.println(testArr.hashCode());
//		System.out.println("데이터 추가 : " + Arrays.toString(testArr));
//		int[] iArr1 = {1,2,3,4,5};
//		int[] iArr2 = {6,7,8,9,0};
//		int[] resArr = util.addAll(iArr1, iArr2);
//		int[] resArr = util.subArr(iArr1, 1, 3);
//		int[] resArr = util.remove(iArr1, 2);
//		System.out.println(Arrays.toString(resArr));
		B_arrayPrac test3 = new B_arrayPrac();
//		test3.test1();
		test3.test2();
	}

}
