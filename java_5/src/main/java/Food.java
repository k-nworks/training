package main.java;

public class Food extends Item {
	private String openDate = "2017/11/25";
	
	Food(String name, int price, int stock) {
		super(name, price, stock);
	}
	
	public String getOpenDate() {
		return this.openDate;
	}
	
	public void printData() {
		super.printData();
		System.out.println("賞味期限：" + this.openDate);
	}
	
}
