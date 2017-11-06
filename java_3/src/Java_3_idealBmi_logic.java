
public class Java_3_idealBmi_logic {
	public static void printData(double height, double weight) {
		double idealBmi = 22.0;
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		double currentBmi = currentBmi(height, weight);
		System.out.println("現在のBMIは" + String.format("%.2f", currentBmi) + "です");
		System.out.println("理想のBMIは" + idealBmi + "です");
		double targetWeight = targetWeight(height, weight, idealBmi);
		System.out.println("理想のBMIになる適正体重は" + String.format("%.2f", targetWeight) + "kgです");
		double untilTargetWeight = untilTargetWeight(weight, targetWeight);
		System.out.println("適正体重より" + String.format("%.2f", untilTargetWeight) + "kg必要です");
	}
	
	public static double currentBmi(double height, double weight) {
		return weight / (height * height) * 10000;
	}
	
	public static double targetWeight(double height, double weight, double idealBmi) {
		return (height * height) * 22 / 10000;
	}
	
	public static double untilTargetWeight(double weight, double targetWeight) {
		return targetWeight - weight;
	}
}
