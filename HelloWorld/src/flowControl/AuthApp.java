package flowControl;

public class AuthApp {

	public static void main(String[] args) {

		String[] user = { "ria" };
		String id = "ria";

		System.out.println("Hi. ");
		if (inputId(user).equals(id)) { // 문자열은 이거로 한다던데..?
//		if (inputId(user) == id) {	// 이것도 true로 뜬다(?)
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

	public static String inputId(String[] user) {
		return user[0];
	}

}
