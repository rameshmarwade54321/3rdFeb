package practice4;

public class C1 
{
	int new1;
	int new2;
	String name;
	
	C1(int a, int b, String N1)
	{
		new1=a;
		new2=b;
		name=N1;
		
	}
	
	
	public void m1() 
	{
		System.out.println(new1+new2);
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		
		C1 S1=new C1(10, 110, "ramesh");
		S1.m1();
	}
}
