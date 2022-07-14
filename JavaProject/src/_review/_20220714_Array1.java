package _review;

import java.util.Arrays;

/**
 * 
 * 하나의 배열에 여러개의 값을 넣기
 *
 */
class Book {
	String title;
	String author;
	int price;

	public Book() {

	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}
}

public class _20220714_Array1 {

	public static void main(String[] args) {

		Book[] books = new Book[3];

		books[0] = new Book("java 7", "안경열", 20000);
		books[1] = new Book("열혈강호", "임재현", 2500);
		books[2] = new Book("무소유", "정혜민", 12000);

		for (int i = 0; i < books.length; i++) {
			Book book = books[i];
			System.out.println(Arrays.toString(books));
		}

	}

}
