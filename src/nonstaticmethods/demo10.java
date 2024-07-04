package nonstaticmethods;

public class demo10 {
	public static void main(String[] args) {
		demo10 E1 = new demo10();
		E1.J1();
		E1.J2();
	}

	public void J1() {
		System.out.println("running nonstatic J1 mewthod");
	}

	public void J2() {
		System.out.println("running nonstatic J2 method");
	}
}
