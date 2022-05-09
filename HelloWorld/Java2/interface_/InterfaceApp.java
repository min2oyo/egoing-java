package interface_;

public class InterfaceApp {

	public static void main(String[] args) {

		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));

	}

}

interface Calculable {

	int sum(int v1, int v2);

}

class RealCal implements Calculable {

	@Override
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

}