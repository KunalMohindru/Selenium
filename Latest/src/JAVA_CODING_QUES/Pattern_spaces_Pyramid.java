package JAVA_CODING_QUES;

public class Pattern_spaces_Pyramid {

	public static void main(String[] args)
	{
	    int count= 0; 
		for (int i=5;i>=1;i--)
		{	
			count++;
			for (int j=i;j>1;j--)
	       	System.out.print(" ");
	        
		    for (int k=1; k<=count; k++)
		    {	System.out.print("*");
		    System.out.print(" ");
		    }
		    System.out.println(" ");
	     }

	}}
