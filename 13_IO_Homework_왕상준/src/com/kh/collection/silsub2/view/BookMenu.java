package com.kh.collection.silsub2.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.kh.collection.silsub2.controller.BookManager;
import com.kh.collection.silsub2.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {
		
	}

	public void mainMenu() {
		
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				// addBook (inputBook()이 리턴한 객체) 실행
				bm.addBook(inputBook());
				break;
			case 2:
				// sortedBookList() 실행
				// => Book[] 리턴 받아 printBookList(Book[]) 실행
				bm.printBookList(bm.sortedBookList()); break;
			case 3:
				// deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
				Book book = bm.deleteBook(inputBookNo());
				// => Book 리턴 받아 null이 아닐 경우 “성공적으로 삭제”
				if(book != null) {
					System.out.println("성공적으로 삭제");
				} else {
					System.out.println("삭제할 글이 존재하지 않음");
				}
				break;
			case 4:
				// searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
				String key = bm.searchBook(inputBookTitle());
				
				if(key == null) {
					// key 리턴 받아 null일 경우 “조회한 글이 존재하지 않음”
					System.out.println("조회한 글이 존재하지 않음");
				} else {
					//null이 아닐 경우 selectBook(key) 출력
					System.out.println(bm.selectBook(key));
				}
				break;
			case 5:
				// selectAll() 실행
				Map<String, Book> bookMap = bm.selectAll();
				
				// 결과 map 리턴 받아 비어있을 경우 “없습니다.”
				if(bookMap == null || bookMap.isEmpty()) {
					System.out.println("없습니다.");
				} else {
					//아닐 경우 Iterator, keySet()을 이용하여 전체 출력
					Iterator<String> iterator = bookMap.keySet().iterator();
					while (iterator.hasNext()) {
						System.out.println(bookMap.get(iterator.next()));
					}
				}
			break;
			case 6:
				// main()으로 리턴
				System.out.println("프로그램이 종료되었습니다."); return;
			default: System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}
		
	}
	
	public Book inputBook() {
		System.out.print("도서 제목 : ");
		String title = sc.next();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		System.out.print("도서 저자 : ");
		String author = sc.next();
		
		Book book = new Book(category, title, author);
		
		return book;
	}
	
	public String inputBookNo() {
		System.out.print("도서 번호 : ");
		String bNo = sc.next();
		return bNo;
	}
	
	public String inputBookTitle() {
		System.out.print("도서 제목 : ");
		String title = sc.next();
		return title;
	}
}
