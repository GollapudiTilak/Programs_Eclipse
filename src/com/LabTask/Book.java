package com.LabTask;

public class Book {
	int book_id;
	String title;
	String author;
	double price;
	double dis_amount;
	double discounted;
	double total;
	//{
	//	book_id++;
	//}
	public static void main(String[] args) {
		Book b = new Book();
		b.book_id = 2130;
		b.title = "one piece";
		b.author = "echiro oda";
		b.price = 1000;
		b.dis_amount = 10;
		b.discounted = b.price*10/100;
		b.total = b.price-b.discounted;

		System.out.println("book_id = "+ b.book_id);
		System.out.println("title = "+ b.title);
		System.out.println("author = "+b.author);
		System.out.println("price = "+ b.price);
		System.out.println("dis_amount = "+ b.dis_amount );
		System.out.println("discounted= "+ b.discounted);
		System.out.println("total= "+ b.total);

		
	}

}