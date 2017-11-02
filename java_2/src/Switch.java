
public class Switch {
	public static void main(String[] args) {
		int num = 5;
		
		switch (num) {
			case 1:
				System.out.println("非常に不満");
				break;
			case 2:
				System.out.println("少し不満");
				break;
			case 3:
				System.out.println("どちらとも言えない");
				break;
			case 4:
				System.out.println("少し満足");
				break;
			case 5:
				System.out.println("大変満足");
				break;
				
			default:
				System.out.println("未回答");
		}
	}
}
