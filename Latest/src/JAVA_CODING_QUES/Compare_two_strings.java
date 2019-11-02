package JAVA_CODING_QUES;

import java.util.Scanner;

public class Compare_two_strings {

	public static void main() {
		String S1,S2;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first string    :" );  
		S1= input.nextLine();
		
		System.out.println("Enter second string   :" );
		S2= input.nextLine();
		
	   if(S1.compareTo(S2) > 0)
	   {
		 System.out.println("This string is large     :" + S1 );  
	   }  
	   
	   else 
		   System.out.println("This string is large    :" + S2 );
	}

}
