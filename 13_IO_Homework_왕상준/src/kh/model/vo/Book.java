package kh.model.vo;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = -6312356845902423747L;
	private String title;
	private int price;
	
	public Book() {
		
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
