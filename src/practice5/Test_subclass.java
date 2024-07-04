package practice5;

public class Test_subclass extends Test_super
{
	
	Test_subclass()
	{
		this(50);
	}
	
	
	Test_subclass(int i) 
	{
		super(i);
		
	}
	
	
	public static void main(String[] args) 
	{
		Test_subclass t1=new Test_subclass();
		Test_subclass t2=new Test_subclass(20);
	}
}
