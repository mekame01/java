package com.kh.e_method;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_restirctor test = new A_restirctor();
		B_return returnTest = new B_return();
		C_arguments argTest = new C_arguments();
		
		//public
//		test.publicMethod();
		//default
//		test.defaultMethod();
		//protected
//		test.protectedMethod();
		//private
//		test.privateMethod();
		
		returnTest.voidTest();
		String res = returnTest.returnTest();
		
		//메서드의 실행결과를 String 타입의 변수 res에 담아 출력
		System.out.println("메서드의 실행결과 : " + res);
		System.out.println("=================================");
		//메서드의 실행결과를 바로 출력
		System.out.println(returnTest.returnTest());
		
		
		
		int intRes = returnTest.intReturnTest();
		//메서드의 실행결과를 int타입의 변수에 담아 출력
		System.out.println("intReturnTest 메서드의 실행결과 : " + intRes);
		//메서드의 실행결과를 바로 출력
		System.out.println(returnTest.intReturnTest());
		
		
//		int argRes = argTest.plus(10, 20);
		System.out.println(" 10 + 20 = " + argTest.plus(10, 20));
		
//		double argRes2 = argTest.div(10.5, 11.7);
		System.out.println(" 10.5 / 11.7 = " + argTest.div(10.5, 11.7));
		
		char argRes3 = argTest.converCase('A');
		System.out.println("A -> " + argRes3);
		
		System.out.println("=================================");
//		System.out.println(argTest.cal(5, 4));
		
		
		
		//클래스의 필드변수를 다른 클래스에서 호출하는 방법.
		//참조형 변수를 생성한 다음 그 참조형 변수를 통해서 필드변수를 호출할 수 있다.
		D_static staticTest = new D_static();
		System.out.println(staticTest.noneStatic);
		
		//static변수는 참조형 변수를 생성할 필요가 없다.
		//이미 프로그램이 시작될 때 메모리에 올라가 있기 때문
		//클래스명(타입명).변수명으로 바로 호출할 수 있다.
		System.out.println(D_static.staticName);
		
		staticTest.methodTest();
		D_static.staticTest();
		
		//참조형 변수를 통해서도 static메서드나 변수를 호출할 수 있다.
		staticTest.staticTest();
		System.out.println(staticTest.staticName);
	}
	
}
