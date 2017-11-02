
public class While {
	public static void main(String[] args) {
		System.out.println("九九の表");
		
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i * j + "");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}
