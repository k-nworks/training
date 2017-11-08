package main.java;

public class Item {
	private String name;
	private int price;
	protected int stock = 100;

	Item(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public int getStock() {
		return this.stock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("価格：" + this.price);
		System.out.println("在庫数：" + this.stock);
	}

}
