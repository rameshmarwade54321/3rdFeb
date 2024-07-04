package methods_static_nonstatic_same_other_class;

public class demo21 {

	public static void main(String[] args) {

		demo21 D1 = new demo21();
		D1.M1();

	}

	public void M1() // non static regular method
	{
		System.out.println("running nonstatic method M1");
	}

}
