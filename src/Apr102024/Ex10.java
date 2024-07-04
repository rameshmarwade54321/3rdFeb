package Apr102024;

public class Ex10 
{    //,.:;'"-?
	public static void main(String[] args) 
	{
		String str="i am , 'in the!. pune";
		
		
		int count =0;
		for(int i=0; i<str.length(); i++)
		{
			if (  str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)=='.' ||
					str.charAt(i)=='\'' || str.charAt(i)=='"')
					{
						count++;
					}
				
				
		}
		System.out.println(count);
		
		
	}
}