package kh.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kh.model.vo.Book;

public class BookManager {

	public void fileSave(String fileName){
		
		//2번 문항의 [원인]에 기술한 Book 객체만 저장할 수 있는 ArrayList bookList 객체를 생성한다.
		ArrayList<Book> bookList = new ArrayList<>();
		
		//bookList 에 아래의 5개의 Book 객체를 리스트에 저장한다.
		bookList.add(new Book("자바를 잡아라", 30000));
		bookList.add(new Book("오라클 정복", 35000));
		bookList.add(new Book("웹표준 2.0", 27500));
		bookList.add(new Book("자바 Servlet/JSP", 28000));
		bookList.add(new Book("ajax 사용법", 15000));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(fileName));) {
			
			oos.writeObject(bookList);
			System.out.println(fileName + " 파일 생성이 완료되었습니다. 프로젝트를 새로고침 해주세요");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
