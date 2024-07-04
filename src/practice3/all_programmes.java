package practice3;

public class all_programmes 
{
	public static void main(String[] args) 
	{
		int i=1;
		do                            // do_while loop
		{
			System.out.println(i*2+"  "+i*3);
			i++;
		}
		while (i<=10);
		
		System.out.println("-----------------------------");
		
		for (int a=10; a>=1; a--)                // for loop
		{
			System.out.println(a*2);
		}
		System.out.println("-----------------------------");
		int c=5;
		while(c<=10)                             // while loop
		{
			System.out.println(c);
			c++;
		}
		System.out.println("-----------------------------");
		
		int marks=350;
		if (marks>=300)
		{
			System.out.println("qualify for direct interview round");
			int Imarks=95;
			if(Imarks>=90)
			{
				System.out.println("selected for the post");
			}
			else
			{
				System.out.println("not selected for the post");
			}
		}
		else if(marks <=300 & marks>=200)
		{
			System.out.println("qualify for mains exam");
		}
		else
		{
			System.out.println("not qualify ");
		}
	}
}
