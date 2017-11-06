// Progate復習　"複数の引数"

public class Java_3_4_10 {

	public static void main(String[] args) {
		printData("Kate Jones", 27);
		printData("John Christopher Smith", 65);
	}
	public static void printData(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}
}
