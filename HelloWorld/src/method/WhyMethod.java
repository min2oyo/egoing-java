package method;

public class WhyMethod {

	public static void main(String[] args) {

		// 100,000,000줄
		printTwoTimes("a", "-"); // 인자, argument
		// 100,000,000줄
		printTwoTimes("a", "*");
		// 100,000,000줄
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");

	}

	public static void printTwoTimes(String text, String delimiter) { // 매개변수, parameter
		System.out.println(delimiter);
		printText(text);
		printText(text);
	}

	public static void printText(String text) {
		System.out.println(text);
	}

}
