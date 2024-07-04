package Practice06;

public class Prg1 
{
	public static void main(String[] args) 
	{
		  //String methods
		
		String str="abcdefgc";
		String str1="    ABCDEFG    ";
		String str3="anand is at yavatmal";
		System.out.println(str.length());  //7
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals(str1));   //
		
		System.out.println(str.toUpperCase().equals(str1));
		System.out.println(str.equalsIgnoreCase(str1)); 
		
		System.out.println(str3.contains(" "));
		System.out.println(str3.startsWith("anand"));
		System.out.println(str3.endsWith("pune"));
		
		
		System.out.println(str.isEmpty());
		System.out.println(str.charAt(4)); //char
		System.out.println(str.indexOf('c'));
		System.out.println(str.lastIndexOf('c'));
		
		System.out.println(str+" "+str1);
		System.out.println(str.concat(str1));
		
		System.out.println(str1.trim());
		
		System.out.println(str3.replace("yavatmal", "pune" ));
		
		        String [] ar= str3.split(" ");
		//String [] ar= {"anand", "is", "at", "yavatmal"}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
}
;