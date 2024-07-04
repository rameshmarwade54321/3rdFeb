package methods;

public class main_method_for_otherclass 
{
	public static void main(String[] args) 
	{
		static_nonstatic_otherclass.M1();
		static_nonstatic_otherclass S2=new static_nonstatic_otherclass();
		S2.M2();
		S2.M3();
		main_method_for_otherclass S3=new main_method_for_otherclass();
		S3.M5();	
	}
	
	public void M5() 
	{
		System.out.println("running non static M5");
		static_nonstatic_otherclass.M1();
		static_nonstatic_otherclass S4=new static_nonstatic_otherclass();
		S4.M2();
		S4.M3();
		M6();	
	}
	
	public static void M6() 
	{
		System.out.println("running noinstatic M6");
	}
	
}

