package Apr102024;

public class Demo09 
{
	public static void main(String[] args) 
	{
		int z=m1(10,20);  //200
		
		int x=100;
		int w=x+z;
		System.out.println(w);
		
		int d=m2("ramesh ", "marwade ",10);
		//d=100
		int e=10;
		
		int h=d*e;
		
		System.out.println(h);
		
	}

	public static  int m1(int a, int b)
	{
		int d= a*b;  
		
		
		return d;	
	}
	
	
	
	public static int m2(String a, String b, int p)
	{
		String c = a.concat(b);
		System.out.println(c);
		int f=p*p;
		return f;
	}
	
}
