package practice01;

 class demo3 
{
	 public static void main(String[] args) 
	 {
		 animal1 a1=new animal1();
		 a1.m1();
	 }
}
 
 class dog1
 {
	public void m1() 
	{
		System.out.println("i am a dog");
	} 
 }
 
 class animal1 extends dog1
 {
	 public void m1() 
	 {
		 super.m1();
		System.out.println("i am a animal");
	 }
 }
