package com.kh.test;

import com.kh.test.person.model.vo.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pArr = new Person[3];
		pArr[0] = new Person("하", 'M');
		pArr[1] = new Person("명", 'M');
		pArr[2] = new Person("도", 'M');
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
	}

}
