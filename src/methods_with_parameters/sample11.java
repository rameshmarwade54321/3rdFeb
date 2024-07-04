package methods_with_parameters;

public class sample11 {
	public static void main(String[] args) {
		studentname("Ramesh");
		System.out.println("------------------------------");
		studentnames("Adesh", "Anand");
		System.out.println("--------------------------------");
		Fullname("Ramesh", "Marwade");
		System.out.println("---------------------------------");
		studentinfo("Ramesh", 0524, 55.2f, 'A');
		System.out.println("-----------------------------");

	}

	public static void studentname(String name) {
		System.out.println(name);
	}

	public static void studentnames(String name1, String name2) {
		System.out.println(name1 + "   " + name2);
	}

	public static void Fullname(String FN, String LN) {
		System.out.println(FN + "  " + LN);
	}

	public static void studentinfo(String Name, int RollNumber, float Per, char grade) {
		System.out.println("Student Name: " + Name);
		System.out.println("Student Roll Number: " + RollNumber);
		System.out.println("student Percentage: " + Per + "%");
		System.out.println("Grade" + grade);
	}

}
