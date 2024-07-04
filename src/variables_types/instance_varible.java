package variables_types;

public class instance_varible 
{
  int e=60;      //instance variable
  
  	public static void main(String[] args) 
  	{
  		instance_varible i1=new instance_varible();
  		System.out.println(i1.e);
  		otherclass_variable o2=new otherclass_variable();
  		System.out.println(o2.z);
  		
	}
  	
  	public static void m3() 
  	{
  		instance_varible i2=new instance_varible();
  		System.out.println(i2.e);
  		
	}
  	
  	public void m4() 
  	{
		System.out.println(e);
	}
  
  
}
