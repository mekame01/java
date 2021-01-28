package com.kh.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.silsub2.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap = new HashMap<String, Book>();

	public BookDao() {
		
	}

	//매개변수 생성자
	//다른 map을 전달 받아 bookMap의 초기값으로 사용함
	public BookDao(HashMap<String, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}
	
	//도서의 마지막 도서 번호 리턴
	public int getLastBookNo() {
		// 첫 글일 경우 0으로 받아오게끔 BookDao의 getLastBookNo() 내용 구현 할 것!
		if(bookMap == null || bookMap.isEmpty()) {
			return 0;
		} else {
			int lastNo = 0;
			//Iterator, keySet() 이용
			Iterator<String> iterator = bookMap.keySet().iterator();
			while (iterator.hasNext()) {
				Book book = bookMap.get(iterator.next());
				int lastBookNo = Integer.parseInt(book.getbNo());
				if(lastNo < lastBookNo) {
					lastNo = lastBookNo;
				}
			}
			return lastNo;
		}
	}
	
	public void addBook(Book book) {
		//전달받은 도서 객체 bookMap에 추가
		bookMap.put(book.getbNo(), book);
	}
	
	public Book deleteBook(String key) {
		//keySet()을 이용하여
		Set<String> keySet = bookMap.keySet();
		for (String string : keySet) {
			//전달받은 도서 번호와 일치하는 도서
			if(key.equals(bookMap.get(string).getbNo())) {
				Book book = bookMap.get(string);
				//bookMap에서 삭제
				bookMap.remove(string);
				//삭제한 객체 리턴
				return book;
			}
		}
		return null;
	}
	
	public String searchBook(String title) {
		//entrySet()을 이용하여
		for (Entry<String, Book> entry : bookMap.entrySet()) {
			//전달받은 도서 제목을 포함하는
			if(entry.getValue().getTitle().contains(title)) {
				//bookMap의 key값 리턴
				return entry.getKey();
			}
		}
		return null;
	}
	
	public Book selectBook(String key) {
		//전달받은 key값을 이용하여 bookMap의 해당 key값의 value인 Book 객체 리턴
		return bookMap.get(key);
	}
	
	public HashMap<String, Book> selectAll() {
		return bookMap;
	}
	
	public ArrayList<Book> sortedBookList() {
		//entrySet()을 이용하여
		//ArrayList<Book>을 가져오고
		ArrayList<Book> bookList = new ArrayList<>();
		for (Entry<String, Book> entry : bookMap.entrySet()) {
			bookList.add(entry.getValue());
		}
		//Collections.sort()를 이용하여 리스트 정렬 후 리턴
		Collections.sort(bookList);
		return bookList;
	}
}
