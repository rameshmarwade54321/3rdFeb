package methods_with_parameters;
                 //addition and substraction using parameter passing
public class addition {
	public static void main(String[] args) {
		add(10, 20);
		add(25, -10);
		addition A1 = new addition();
		A1.Sub(20, 10);
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public void Sub(int a, int b) {
		System.out.println(a - b);
	}

}
