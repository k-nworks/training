package main.java;

public class Book extends Item {
	private String genre = "プログラミング";

	Book(String name, int price, int stock) {
		super(name, price, stock);
	}
	
	public String getGenre() {
		return this.genre;
	}

	public void printData() {
		super.printData();
		System.out.println("ジャンル：" + this.genre);
	}

}
