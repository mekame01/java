package skillup.day03.library.controller;

import skillup.day03.library.model.vo.AniBook;
import skillup.day03.library.model.vo.Book;
import skillup.day03.library.model.vo.CookBook;
import skillup.day03.library.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "tvN", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public LibraryManager() {
		
	}
	
	public void insertMember(Member m) {
		// 전달 받은 m을 this의 mem에 대입
		this.mem = m;
	}
	
	public Member myPage() {
		// 회원 레퍼런스(mem) 주소 값 리턴
		System.out.println(mem.toString());
		return mem;
	}
	
	public Book[] selectAll() {
		// 도서 객체배열 레퍼런스(bList) 주소 값 리턴
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성(임의로 크기 5로 생성)
		Book[] searchList = new Book[5];
		int idx = 0;
		// for문을 이용하여 bList 도서들 제목 중 전달 받은 키워드를 포함한 도서가 있으면
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				searchList[idx] = bList[i];
				idx++;
			}
		}
		//  HINT : 조건식에 String클래스의 contains()사용
		// searchList 객체배열에 담기 (int count; 변수 이용)
		// searchList 주소 값 리턴
		return searchList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
				result = 1;
			}
		} else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				// 회원의 couponCount 수 1 증가 처리하고
				mem.setCouponCount(mem.getCouponCount()+1);
				// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰 발급 성공
				result = 2;
			}
		}
			
		return result;
	}
}
