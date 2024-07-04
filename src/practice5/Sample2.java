package practice5;

public class Sample2 extends Sample1
{

	
	//method hiding
	public static void main(int a) 
	{
		System.out.println(a*a);
	}
	
	public void m1(String b) 
	{
		System.out.println("m1 from Sample1");
	}
	
	public void m1() 
	{
		System.out.println("m1 from Sample2");
	}
	
//	public void m1(int a, int b) 
//	{
//		System.out.println(a*b);
//	}
	
	public static void main(String[] args) 
	{
		Sample2 s2=new Sample2();
		s2.m1("ramesh");
		s2.m1();
		s2.main();
	}
	
}
