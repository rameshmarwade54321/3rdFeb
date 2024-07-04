package practice5;

public class Test3 
{
    //131        131    1  13   131
	public static void m1(int num) 
	{
		
	
	int c, rem, sum=0;
	
	c=num;
	
	while(num>0)  // 131  13  1
	{
		rem=num%10;   // rem=1   3   1
		sum=(sum*10)+rem;  // sum=1   13    131
		num=num/10;   // num=13  1    0
		
		
	}
	if(c==sum)
	{
		System.out.println("num is palindrome");
	}
	else
	{
		System.out.println("num is not palindrome");
	}
	
	System.out.println("reverse number "+sum);
	}
	
	public static void main(String[] args) 
	{
		m1(131);
		m1(515);
		m1(7586);
		m1(1000);
		m1(150051);
		m1(51);
		
	}
	}

