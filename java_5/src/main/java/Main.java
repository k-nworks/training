package main.java;

import java.util.Date;
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
		
		Store store = new Store();
		Date date = new Date();
		
		System.out.println("【食品の情報】");
	    food.printData();
	    System.out.println("-----------------");
	    System.out.print("数量を入力してください：");
		int quantity = scanner.nextInt();
		// Storeで購入処理
		store.purchase(quantity, food, person1, date);
		
		// Personで購入処理
//		person1.buy(quantity, food, store);
		
		System.out.println("=================");
	    
	    System.out.println("【飲料品の情報】");
	    drink.printData();
	    System.out.println("-----------------");
	    System.out.print("数量を入力してください：");
		quantity = scanner.nextInt();
		store.purchase(quantity, drink, person2, date);
		
	    System.out.println("=================");
	    
	    System.out.println("【本の情報】");
	    book.printData();
	    System.out.println("-----------------");
	    System.out.print("数量を入力してください：");
		quantity = scanner.nextInt();
		store.purchase(quantity, book, person3, date);
		
		System.out.println("=================");
		
//		store.history(quantity, item, person);
		
		scanner.close();
	}

}
