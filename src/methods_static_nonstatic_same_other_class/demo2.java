package methods_static_nonstatic_same_other_class;
                               //multiple  static regular method in same class
public class demo2 {
	public static void main(String[] args) {
		System.out.println("main method started");
		M1();
		M2();
		M1();
		System.out.println("main method ended");
	}

	public static void M1() {
		System.out.println("running method m1");
	}

	public static void M2() {
		System.out.println("running method m2");
	}

}
