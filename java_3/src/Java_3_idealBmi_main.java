// 理想のBMI値(22)までに必要な体重を求める!!!
import java.util.*;

public class Java_3_idealBmi_main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("身長(cm):");
		double height = scanner.nextDouble();
		
		System.out.print("体重(kg):");
		double weight = scanner.nextDouble();
		
		scanner.close();
		
		Java_3_idealBmi_logic.printData(height, weight);
	}
}
