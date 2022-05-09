package inheritance;

public class InheritanceApp {

	public static void main(String[] args) {

		Cal1 c1 = new Cal1();
		System.out.println(c1.sum(2, 1));

		Cal2 c2 = new Cal2();
		System.out.println(c2.sum(2, 1));
		System.out.println(c2.minus(2, 1));
		System.out.println(c2.sum(2, 1));

	}

}

class Cal1 {

	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	// Overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) + v3;
	}

}

class Cal2 extends Cal1 {

	@Override
	public int sum(int v1, int v2) {
		System.out.println("Cal2!!!");
		return super.sum(v1, v2);
	}

	public int minus(int v1, int v2) {
		return v1 - v2;
	}

}
