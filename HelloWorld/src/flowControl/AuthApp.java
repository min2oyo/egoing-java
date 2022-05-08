package flowControl;

public class AuthApp {

	public static void main(String[] args) {

		String id = "ria";
		String[] user = { "ria" };

		System.out.println("Hi. ");
		if (id.equals(inputId(user))) { // 문자열은 이거로 한다던데..?
//		if (id == inputId(user)) {	// 이것도 실행된다(?)
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

	public static String inputId(String[] user) {
		return user[0];
	}

}
