// Progate復習　"入力を受け取ろう（２）"

public class Java_3_13_37_person {
	public static void printData(String name, int age, double height, double weight, String homeTown, String hobby, String favoriteFood) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		double bmi = bmi(height, weight);
		System.out.println("BMIは" + bmi + "です");
		
		if (isHealthy(bmi)) {
			System.out.println("健康です");
		} else {
			System.out.println("健康ではありません");
		}
		
		System.out.println("私の出身は" + homeTown + "です");
		System.out.println("私の趣味は" + hobby + "です");
		System.out.println("私の好きな食べ物は" + favoriteFood + "です");
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static String fullNmae(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public static double bmi(double height, double weight) {
		return weight / (height * height) * 10000;
	}
	
	public static boolean isHealthy(double bmi) {
		return bmi >= 18.5 && bmi < 25.0;
	}
}
