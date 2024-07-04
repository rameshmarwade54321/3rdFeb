package methods_with_parameters;

public class sample5 {
	public static void main(String[] args) {
		mult(5, 6);
		mult(20, 10);
		System.out.println("----------------------");
		sample5 S5 = new sample5();
		S5.div(55, 5);
		System.out.println("-------------------------");
		sample6.squre(5);
		System.out.println("----------------------------");
		sample6 S6=new sample6();
		S6.cube(10);
		

	}

	public static void mult(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

}
