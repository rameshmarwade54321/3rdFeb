package practice;

public class method_with_parameter_sameclass {
	public static void main(String[] args) {
		add(5, 10);
		System.out.println("-----------------------------");
		method_with_parameter_sameclass M1=new method_with_parameter_sameclass();
		M1.Sub(50, 10);
		System.out.println("-----------------------------");
		studentinfo("Ramesh", 21345, 55.2f, 'A');
	}

	public static void add(int a, int b) {
		System.out.println("addition: "+(a + b));
	}
	public void Sub(int a, int b) {
		System.out.println("Substraction: "+(a-b));
	}
	public static void studentinfo(String Name, int Number, float Per, char grade) {
		System.out.println("Name: "+Name);
		System.out.println("Number:"+Number);
		System.out.println("Per: "+Per);
		System.out.println("grade: "+grade);
	}
	
	
}
