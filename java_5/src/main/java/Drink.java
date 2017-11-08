package main.java;

public class Drink extends Item {
	private int size = 500;

	Drink(String name, int price, int stock) {
		super(name, price, stock);
	}
	
	public double getSize() {
		return this.size;
	}

	public void printData() {
		super.printData();
		System.out.println("サイズ：" + this.size + "ml");
	}

}
