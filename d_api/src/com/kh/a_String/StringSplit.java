package com.kh.a_String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringSplit {

	public void splitTest() {
		//String.split
		String str = "boo:and:foo";
		String[] result = str.split(":");
		System.out.println(Arrays.toString(result));
//		System.out.println(Arrays.toString("boo:and:foo".split(":")));
		
	     StringTokenizer st = new StringTokenizer("This is a test.", "t", true);
	     //구분자 매개변수를 넣어주지 않으면 공백으로 String을 쪼갠다.
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
	 

	}
}
