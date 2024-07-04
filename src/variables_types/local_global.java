package variables_types;

public class local_global 
{
	 static int i =40;   // static global variable //class variable
	
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);//local variable
		System.out.println(i);
		m1();
		local_global L1=new local_global();
		L1.m2();
		System.out.println("-------------------");
		System.out.println(otherclass_variable.d);
		
		
		
		
	}
	
	public static void m1() 
	{
	    int b=20;
	    
	    System.out.println(b);
		System.out.println(i);
	}
	
	public void m2() 
	{
		
		int c =30;
		System.out.println(c);
		System.out.println(i);
	}
}
