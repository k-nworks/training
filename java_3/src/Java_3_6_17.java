// Progate復習　"メソッドのオーバーロード"

public class Java_3_6_17 {
	public static void main(String[] args) {
		printData(fullName("Kate", "Jones"), 27);
		printData(fullName("John", "Christopher", "Smith"), 65);
	}
	
	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static String fullName(String firstName, String middleName, String lastName) {
		return firstName + " " + middleName + " " + lastName;
	}
}
