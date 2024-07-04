package practice5;
import java.util.Arrays;
public class Mockinterview_example 
{
	public static void main(String[] args) 
	{
		int []a1= {40,20,16,28,30,10,7};
		
	//    System.out.println(a1.length);
//		Arrays.sort(a1);
//		for(int i =0; i<=a1.length-1; i++)
//		{
//			System.out.print(a1[i]+" ");
//		}
		
	      int min=a1[0];    //min=40
//	      int max=a1[0];
	      int temp;
			      
	 for(int j=0; j<a1.length; j++)  
	 {
		 
	    for(int i =j+1; i<a1.length; i++)
		{
			if(a1[j]>a1[i])     //
			{
				temp=a1[j];
				a1[j]=a1[i];
				a1[i]=temp;
//				min=a1[i];
				
			}
			
		}
	    System.out.print(a1[j]+" ");
		//a1[0]=min;
	
	 }	
	}
}
