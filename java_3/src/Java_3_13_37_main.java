// Progate復習　"入力を受け取ろう（２）"

import java.util.Scanner;

public class Java_3_13_37_main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前:");
		String firstName = scanner.next();
		
		System.out.print("名字:");
		String lastName = scanner.next();
		
		System.out.print("年齢:");
		int age = scanner.nextInt();
		
		System.out.print("身長(cm):");
		double height = scanner.nextDouble();
		
		System.out.print("体重(kg):");
		double weight = scanner.nextDouble();
		
		System.out.print("出身:");
		String homeTown = scanner.next();

		System.out.print("趣味:");
		String hobby = scanner.next();
		
		System.out.print("好きな食べ物:");
		String favoriteFood = scanner.next();
		
		scanner.close();
		
		Java_3_13_37_person.printData(Java_3_13_37_person.fullName(firstName, lastName), age, height, weight, homeTown, hobby, favoriteFood);
	}
}
