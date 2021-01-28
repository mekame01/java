package com.kh.c_collection.a_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kh.c_collection.model.vo.Music;

public class ListTest {

	public void doList() {
		
		//Generic : 클래스 내부에서 사용하는 타입을 외부에서 결정하는 것
		//			인스턴스화할 때 타입이 결정된다.
		//			Generic을 지정하지 않으면 Object타입으로 지정된다.
		//			자바 1.7버전부터 Generic 타입 유추 기능이 도입
		//	Generic을 사용하는 이유 : 안정성이 문제.
//		List<Music> list = new ArrayList<Music>();
		List<Music> list = new ArrayList<>();
		
		//CRUD : Create(생성), Read(읽기), Update(수정), Delete(삭제)
		// * 늘 출력해서 확인해보기. -> System.out.println(list);
		
		//1. list의 제일 끝에 데이터를 추가
		//new Music("백지영", "총 맞은 것처럼")
		//new Music("김경호", "금지된 사랑")
		//new Music("윤도현", "나는 나비")
		list.add(new Music("백지영", "총 맞은 것처럼"));
		list.add(new Music("김경호", "금지된 사랑"));
		list.add(new Music("윤도현", "나는 나비"));
//		System.out.println(list);
		
		//size() : 리스트의 크기를 반환
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//2. 2번 인덱스에 데이터 추가하기
		//new Music("자우림", "스물 다섯, 스물 하나")
		list.add(2, new Music("자우림", "스물 다섯, 스물 하나"));
//		System.out.println(list);
		for (Object object : list) {
			System.out.println(object);
		}
		
		//3. list안에 들어있는 데이터 개수 출력하기
		System.out.println("3. list 안의 데이터 개수 : " + list.size());
		
		//4. Music타입의 레퍼런스로 list의 2번 인덱스에 저장된 값 받아서
		//  출력하기
		Music music = list.get(2);
		System.out.println("4. " + music);
		
		//5. 2번 인덱스의 데이터를 수정
		//new Music("아이유", "너와 나")
		list.set(2, new Music("아이유", "너와 나"));
		System.out.println(list);
		
		//6. 2번 인덱스 데이터 삭제
		list.remove(2);
		System.out.println(list);
		
		//7. new Music("백지영", "총 맞은 것처럼") 데이터가
		// list안에 있는지 확인해보기
		// * 만약에 없다고 나오면 Music클래스의 코드를 수정해 정확한 값 받아보기
		System.out.println("7. 백지영, 총 맞은 것처럼 있나? : "
				+ list.contains(new Music("백지영", "총 맞은 것처럼")));
		
		// * 8. new Music("백지영", "총 맞은 것처럼") 데이터가 저장된 인덱스 반환
		System.out.println(list.indexOf(new Music("백지영", "총 맞은 것처럼")));
		
		//9. list의 0번 인덱스부터 2번 인덱스 앞(1번 인덱스까지)의 데이터를 잘라내
		// 새로운 ArrayList로 반환받아 출력
		List list2 = new ArrayList();
		list2 = list.subList(0, 2);
		System.out.println(list2);
	}
}
