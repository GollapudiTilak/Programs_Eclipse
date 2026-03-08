package com.LabTask.constructors;

public class Book {
	String bookName;
	String authorName;
	double price;
	String releasedon;

	Book() {
		this("Amma Diarylo Konni Pageelu");
	}

	Book(String bookName) {
		this(bookName, "Ravi Mantri");
	}

	Book(String bookName, String authorName) {
		this(bookName, authorName, 220);
	}

	Book(String bookName, String authorName, double price) {
		this(bookName, authorName, price, "8 June 2023");
	}

	Book(String bookName, String authorName, double price, String releasedon) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.releasedon = releasedon;
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.details();
	}

	void details() {
		System.out.println("Book Name : " + bookName);
		System.out.println("Author Name : " + authorName);
		System.out.println("Price : " + price);
		System.out.println("Relased On : " + releasedon);
	}
}
