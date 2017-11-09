package main.java;

import java.util.Date;

public class History {
	private Main quantity;
	private Item item;
	private Person person;
	private Date date;

	public void history(Store purchase) {
		this.history = history(purchase);
	}

	public Main getQuantity() {
		return quantity;
	}

	public void setQuantity(Main quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
