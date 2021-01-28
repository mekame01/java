package com.kh.c_collection.a_list.simple;

import com.kh.c_collection.model.vo.Music;

public class Run {

	public static void main(String[] args) {

		SimpleLinkedList<Music> list = new SimpleLinkedList<>();
		
		list.add(new Music("백지영", "총 맞은 것처럼"));
		list.add(new Music("김경호", "금지된 사랑"));
		list.add(new Music("윤도현", "나는 나비"));
		
		System.out.println("1.==================================");
		//size() : 리스트의 크기를 반환
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("2.==================================");
		list.set(2, new Music("아이유", "미아"));
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("3.==================================");
		list.remove(2);
		//size() : 리스트의 크기를 반환
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//예외 발생을 위한 코드
		System.out.println("4.==================================");
		System.out.println(list.get(1));
		list.remove(1);
		
		System.out.println("5.==================================");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Iterator 구현 후 for-each문-----------------");
		for (Music m : list) {
			System.out.println(m);
		}

	}

}
