
class PersonProgate {
	// インスタンスフィールドの定義
	private static int count = 0;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	private String job;

	// ミドルネーム無のコンストラクタ
	PersonProgate(String firstName, String lastName, int age, double height, double weight, String job) {
		PersonProgate.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
	}

	// ミドルネーム有のコンストラクタ
	PersonProgate(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
		this(firstName, lastName, age, height, weight, job);
		this.middleName = middleName;
	}

	public String getJob() {
		return this.job;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setJob(String job) {
		this.job = job;
	}

	// ミドルネーム有無の判別
	public String fullName() {
		if (this.middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}

	// 出力データの定義
	public void printData() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年齢は" + this.age + "歳です");
		System.out.println("BMIは" + Math.round(this.bmi()) + "です");
		System.out.println("仕事は" + this.job + "です");
	}

	// BMIを計算
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 登録人数を計算
	public static void printCount() {
		System.out.println("合計" + PersonProgate.count + "人です");
	}

}
