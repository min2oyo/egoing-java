package inheritance;

public class InheritanceApp {

	public static void main(String[] args) {

		Cal1 c1 = new Cal1();
		System.out.println(c1.sum(2, 1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(2, 1));
			
	}

}

class Cal1 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
}

class Cal2 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}

class Cal3 extends Cal1 {

}
