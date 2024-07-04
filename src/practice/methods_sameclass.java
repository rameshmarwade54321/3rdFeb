package practice;

public class methods_sameclass {
	public static void main(String[] args) {
		M1();
		System.out.println("--------------------------------------------------");
		methods_sameclass D1 = new methods_sameclass();
		D1.M2();
		System.out.println("-------------------------------------------------");
		

	}

	public static void M1() {
		System.out.println("running static regular method M1 without parameter in same class ");
	}

	public void M2() {

		System.out.println("running non static regular method M2 without parameter in same class");
	}
}
