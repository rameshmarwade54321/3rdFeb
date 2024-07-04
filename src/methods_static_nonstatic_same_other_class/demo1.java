package methods_static_nonstatic_same_other_class;
                        //static regular method in same class
public class demo1 {
	public static void main(String[] args) {
		System.out.println("main method started");
		M1();
		System.out.println("main method ended");
	}

	public static void M1() {                                         //static regular method
		System.out.println("running regular method m1");
	}

}
