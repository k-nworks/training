package main.java;

import java.util.Date;

public class Store {
	private int price;
	private Person customer;
	private int quantity = 0;
	private int money;
	private int stock;
	
	public Person getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Person person) {
		this.customer = person;
	}
	
	public int getQuantity() {
		return this.quantity;	
	}
	
	public Item getItem() {
		return this.getItem();
	}
	
	public Person getPerson() {
		return this.getPerson();
	}
	
	public void purchase(int quantity, Item item, Person person, Date date) {
		this.quantity = quantity;
		this.price = item.getPrice() * quantity;
		this.customer = person;
		this.money = person.getMoney() - this.price;
		this.stock = item.getStock() - this.quantity;
		Date d = new Date();
		System.out.println("購入数：" + this.quantity + "個");
		System.out.println("購入金額：" + this.price + "円");
		System.out.println("-----------------");
		System.out.println("【購入者の情報】");
		System.out.println("名前：" + this.customer.fullName());
		System.out.println("所持金：" + person.getMoney() + " → " + this.money);
		System.out.println("購入日：" + d.toString());
		System.out.println("-----------------");
		System.out.println("【店舗の情報】");
		System.out.println("在庫数：" + item.getStock() + " → " + this.stock);
		// 配列を定義する　1個の購入情報を格納する
		List 
		History history = new History(purchase);
	}

}
