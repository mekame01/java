package kh;

import kh.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		new BookManager().fileSave("books.dat");
	}
}
