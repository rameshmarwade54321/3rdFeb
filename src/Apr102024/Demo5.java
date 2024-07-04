package Apr102024;

public class Demo5 extends Demo4
{

	Demo5()
	{
		
		super();
		System.out.println("demo5 zero para constructor ");
		
	}
	
	
	Demo5(int a)
	{
		System.out.println("demo5 int constructor ");
	}
	
	
	public static void main(String[] args) 
	{
		Demo5 d5=new Demo5();
		
	}
}


