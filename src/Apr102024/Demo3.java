package Apr102024;

public class Demo3 extends Demo2
{
	
	
	public void m2() 
	{
		super.m1();
		this.m3();
		this.m4();
		
		System.out.println("m2 from demo3");
		
		
	}
	
	public void m3() 
	{
		System.out.println("m3 from demo3");
	}
	public void m4() 
	{
		System.out.println("m4 from demo3");
	}
	
	public static void main(String[] args) 
	{
		Demo3 d3=new Demo3();
		d3.m2();
	}
	
	
}

