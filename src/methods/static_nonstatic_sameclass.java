package methods;

public class static_nonstatic_sameclass 
{
	public static void main(String[] args) 
	{
		M1();
//		static_nonstatic S1=new static_nonstatic();
//		S1.M2();
		
	}
	public static void M1() 
	{
		System.out.println("running static M1");
		System.out.println("---------------------");
		static_nonstatic_sameclass S1=new static_nonstatic_sameclass();
		S1.M2();
		
	}
	public void M2() 
	{
		System.out.println("running nonstatic M2");
		M3();
	}
	public void M3() 
	{
		System.out.println("running nonstatic M3");
	}
}
