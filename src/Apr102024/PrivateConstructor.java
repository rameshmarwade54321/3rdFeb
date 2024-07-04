package Apr102024;



class SingletonDemo
{  
  private SingletonDemo() 
  {  
     System. out.println("In a private constructor");  
  }  
  public static SingletonDemo getObject() 
 {  
       
     if (ref == null)  
        ref = new SingletonDemo();  
     return ref;  
  }  
  private static SingletonDemo ref;  
}  

public class PrivateConstructor 
{  
  public static void main(String args[]) 
  {  
    SingletonDemo sObj = SingletonDemo.getObject();  
  }  
}
