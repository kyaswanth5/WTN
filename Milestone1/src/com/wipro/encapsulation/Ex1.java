package com.wipro.encapsulation;

public class Ex1 {
	public static void main(String[] args) {
		  Author details = new Author("yaswanth", "yaswanth@book.com", 'F');
	      System.out.println(details);
	      Book book = new Book("BEST BOOK", details,6.56, 43);
	      System.out.println(book);
	      book.setPrice(5.8);
	      book.setQtyInstock(38);
	      System.out.println("name is: " + book.getName());
	      System.out.println("price is: " + book.getPrice());
	      System.out.println("qty is: " + book.getQtyInstock());
	      System.out.println("author is: " + book.getAuthor());  
	      System.out.println("author's name is: " + book.getAuthor().getName());
	      System.out.println("author's email is: " + book.getAuthor().getEmail());
	      System.out.println("author's gender is: " + book.getAuthor().getGender());
	      Book nbook = new Book("Best Book", new Author("yash", "yash@some.com", 'F'), 5.99, 10);
	      System.out.println(nbook); 
	   }
	   

}
