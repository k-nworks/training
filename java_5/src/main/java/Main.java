package main.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Person person1 = new Person("Nozomi", "Sasaki", 27, 1.6, 50.0, 10000);
		Person person2 = new Person("Yui", "Aragaki", 28, 1.65, 450.0, 30000);
		Person person3 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0, 50000);
		
		Food food = new Food("あきたこまち", 2500, 25);
		Drink drink = new Drink("エビアン", 100, 150);
		Book book = new Book("はじめてのRuby", 1800, 60);
		
		Store store1 = new Store();
		
		store1.setCustomer(store1);
		store1.buy(food);
		
		store.setCustomer(person2);
		person2.buy(drink);
		
		store.setCustomer(person3);
		person3.buy(book);
		
		System.out.println("【食品の情報】");
	    food.printData();
	    
	    System.out.println("-----------------");
	    
	    System.out.print("購入数を入力してください：");
		int itemNumber = scanner.nextInt();
		store.purchase(itemNumber);
		store.printPurchaser();
		store.getCustomer().printData();
	    
		System.out.println("=================");
	    
//	    System.out.println("【飲料品の情報】");
//	    store.printData();
//	    store.printPurchaser();
//	    store.getCustomer().printData();
//		
//	    System.out.println("=================");
//	    
//	    System.out.println("【本の情報】");
//	    book.printData();
//	    book.printPurchaser();
//		book.getCustomer().printData();
		
		scanner.close();
	}

}
