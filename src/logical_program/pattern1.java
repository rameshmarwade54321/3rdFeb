package logical_program;

public class pattern1 
{
	public static void main(String[] args) 
	{
	
		 int rows = 5;

	        // Outer loop for rows
	        for (int i = 0; i <= rows; i++) 
	        {
	            // Inner loop for columns
	            for (int j = 0; j <= i; j++) 
	            {
	                // Print asterisks
	                System.out.print("* ");
	            }
	            // Move to the next line
	            System.out.println();
	        }
	    }
	}

