package methods_with_parameters;

public class sapmle8 {
public static void main(String[] args) {
	sapmle8 S8=new sapmle8();
S8.addsub(5, 6, 2, 1);
}

public void addsub(int a, int b, int c, int d) {
	System.out.println(a+b);
	System.out.println(c+d);
	
	System.out.println(a+b+c+d);
	System.out.println(a+b-c+d);
	System.out.println((a+b)*(c+d));
}
}
