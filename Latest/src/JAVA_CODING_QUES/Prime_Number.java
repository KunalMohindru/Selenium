package JAVA_CODING_QUES;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) 
{
		
		
		System.out.println(" Enter any number");
		Scanner no = new Scanner(System.in);
		int k = no.nextInt();
		int i=2;
		while (i<=(k/2))
		{ 
			if((k%i)==0)
			{	
				System.out.println("Not a prime number");	
				break;
			}	
			else
			i++;
			
	
		}
		
		System.out.println("Prime number");

}

}
