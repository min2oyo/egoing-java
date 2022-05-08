package flowControl;

public class AuthApp {

	public static void main(String[] args) {

		String[] user = { "ria", "1111" };
		String id = "ria";
		String password = "1111";

		System.out.println("Hi. ");
		if (user[0].equals(id) && user[1].equals(password)) { // 문자열은 이거로 한다던데..?
//		if (user[0] == id && user[1] == password) {	// 이것도 true로 뜬다(?)
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
