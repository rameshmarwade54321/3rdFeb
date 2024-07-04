package methods_static_nonstatic_same_other_class;

//non static methods running in same class
public class demo22 {
	public static void main(String[] args) {
		demo22 D2 = new demo22();
		D2.M2();
		D2.M3();
	}

	public void M2() {
		System.out.println("running nonstatic method M2");

	}

	public void M3() {
		System.out.println("running nonstatic method M3");

	}
}
