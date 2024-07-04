package methods_with_parameters;

public class sample3 {
	public static void main(String[] args) {
		M1();
		sample3 S3 = new sample3();
		S3.M2();
		sample4.M5();
		sample4 S4 = new sample4();
		S4.M6();
		add(44.5f, 0.96f);
	}

	public static void M1() {
		System.out.println("running static regular method M1 in same class");
	}

	public void M2() {
		System.out.println("running non static regular method M2 in same class");
	}

	public static void add(float a, float b) {
		System.out.println(a + b);
	}
}
