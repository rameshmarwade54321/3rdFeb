package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class mock_collection 
{

	public static void main(String[] args) 
	{
		//null null anmol,amol,amol,ankit,vijay,sneha,sneha

		ArrayList ar=new ArrayList();
		ar.add(null);
		ar.add(null);
		ar.add("anmol");
		ar.add("amol");
		ar.add("amol");
		ar.add("ankit");
		ar.add("vijay");
		ar.add("sneha");
		ar.add("sneha");
		
		
		System.out.println(ar);
		
		LinkedHashSet lh=new LinkedHashSet(ar);
		
		System.out.println(lh);
		
	}
}
