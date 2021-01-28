package com.kh.test;

import com.kh.e_method.A_restirctor;

public class E_methodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_restirctor test = new A_restirctor();
		
		//public : 다른 패키지에서도 호출할 수 있다.
		test.publicMethod();
		
		//default : 같은 패키지 안에서만 호출할 수 있다.
//		test.defaultMethod();
		
		//protected : 같은 패키지 또는 상속관계일 때 호출 가능.
//		test.protectedMethod();
		
		//private : 같은 클래스 안에서만 호출 가능.
//		test.privateMethod();
		
	}

}
