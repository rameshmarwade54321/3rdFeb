package methods_with_parameters;

public class sample1 {
	public static void main(String[] args) {
		M1();
		sample1 S1 = new sample1();
		S1.M2();
		sample2.M3();
		sample2 S2 = new sample2();
		S2.M4();
	}

	public static void M1() {
		System.out.println("running static regular method M1 from same class");
	}

	public void M2() {
		System.out.println("running non static regular method M2 from same class");
	}
}
