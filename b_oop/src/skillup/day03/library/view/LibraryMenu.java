package skillup.day03.library.view;

import java.util.Scanner;

import skillup.day03.library.controller.LibraryManager;
import skillup.day03.library.model.vo.AniBook;
import skillup.day03.library.model.vo.Book;
import skillup.day03.library.model.vo.CookBook;
import skillup.day03.library.model.vo.Member;

public class LibraryMenu {

	Scanner sc = new Scanner(System.in);
	private LibraryManager lm = new LibraryManager();
	
	public LibraryMenu() {
		
	}
	
	public void mainMenu() {
		
		System.out.print("이름을 입력하시오 : ");
		String name = sc.next();
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		System.out.print("성별(F/M)을 입력하시오 : ");
		char gender = sc.next().charAt(0);
		
		
		
		// 입력 받은 이름, 나이, 성별로 Member 매개변수 생성자를 이용하여 생성 후
		// LibraryManager의 insertMember() 메소드에 생성한 객체 주소 값 전달
		lm.insertMember(new Member(name, age, gender));
		
		while(true) {
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기 ");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴를 입력해주세요. : ");
			
			switch(sc.nextInt()) {
			case 1: lm.myPage(); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("메뉴를 잘봇 입력하셨습니다."); continue;
			}
		}
	}
	
	public void selectAll() {
		// LibraryManager의 selectAll() 메소드 호출하여 그 결과값 Book[] 자료형에 담기
		Book[] bList = lm.selectAll();
		
		// for문을 이용하여 bList의 모든 도서 목록 출력
		for(int i = 0; i < bList.length; i++) {
			System.out.print(i + "번 도서 : ");
			if(bList[i] instanceof CookBook) {
				CookBook cb = (CookBook)bList[i];
				System.out.println(cb.getTitle() + " / " + cb.getAuthor() + " / " 
						+ cb.getPublisher()+ " / " + cb.isCoupon());
			} else if(bList[i] instanceof AniBook) {
				AniBook ab = (AniBook)bList[i];
				System.out.println(ab.getTitle() + " / " + ab.getAuthor() + " / " 
						+ ab.getPublisher()+ " / " + ab.getAccessAge());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목의 키워드 입력 : ");
		String keyword = sc.next();
		// 입력 받은 키워드를 LibraryManager의 searchBook() 메소드에 전달
		// 그 결과 값을 Book[] 자료형에 담기
		Book[] searchList = lm.searchBook(keyword);
		// for문을 이용하여 검색 결과의 도서 목록 출력
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[0] == null) {
				System.out.println("검색결과가 없습니다.");
			} else if(searchList[i] == null) {
				return;
			}
			
			System.out.println(searchList[i].toString());
		}
	}
	
	public void rentBook() {
		// “대여할 도서 번호 선택 : “ >> 전체조회를 통해 보여지는 도서번호 입력 받음
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		// 그 결과 값을 result로 받고 그 result가
		int result = lm.rentBook(index);
		// 0일 경우  “성공적으로 대여되었습니다.”
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if(result == 2) {
			System.out.println("성공적으로 대여되었습니다.");
			System.out.println("요리학원 쿠폰이 발급되었습니다.");
			System.out.println("마이페이지에서 확인하세요.");
		}
	}
}
