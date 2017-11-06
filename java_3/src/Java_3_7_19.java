// Progate復習　"メソッドを組み合わせよう"

public class Java_3_7_19 {
	public static void main(String[] args) {
		printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
		printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
	}
	
	public static void printData(String name, int age, double height, double weight) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "mです");
		System.out.println("体重は" + weight + "kgです");
		
		double bmi = bmi(height, weight);
		System.out.println("BMIは" + bmi + "です");
	}
	
	// 名前と名字のメソッド
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	// 名前とミドルネームと名字のメソッド
	public static String fullName(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;
	}
	
	// BMIを算出するメソッド
	public static double bmi(double height, double weight) {
		return weight / height / height;
	}
}
