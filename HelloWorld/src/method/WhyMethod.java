package method;

public class WhyMethod {

	public static void main(String[] args) {

		// 100,000,000줄
		printTwoTimesA();
		// 100,000,000줄
		printTwoTimesA();
		// 100,000,000줄
		printTwoTimesA();

	}

	public static void printTwoTimesA() {
		System.out.println("-");
		printA();
		printA();
	}

	public static void printA() {
		System.out.println("a");
	}

}
