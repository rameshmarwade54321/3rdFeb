package practice5;

public interface Sample12 
{
	int a=10;
	
	void m1(int a);
	
	 void m1(String a);
	 
	 public static void m1() 
	 {
		 System.out.println("Ramesh");
	 }
	 
	 default void m1(int a, int b)
	 {
		 System.out.println("ramesh 1");
	 }
	
}
