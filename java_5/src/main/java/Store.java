package main.java;

public class Store {
	private int price;
//	private Person owner;
	private int number = 0;
	
	public Person getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Person person) {
		this.customer = person;
	}
	
	public void printPurchaser() {
		System.out.println("-----------------");
		System.out.println("【購入者の情報】");
	}
	
	public void purchase(int number) {
		System.out.println(number + "個購入します");
		this.number += number;
		this.price = price * number;
		System.out.println("購入数：" + this.number + "個");
		System.out.println("購入金額：" + this.price + "円");
	}
	
	public void buy(Store store) {
		store.setCustomer(this);
	}

}
