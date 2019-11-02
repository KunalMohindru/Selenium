package JAVA_CODING_QUES;

import java.util.Scanner;

public class Rid_of_Space_in_String {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the string");

		 Scanner Input = new Scanner (System.in);     
	     String s =Input.nextLine();
	     String k= ""; 
	     int m =0;
	     int len = s.length();
	     
	     for (int i=0;i<=len-1; i++)
	     { 
	    	 char f = s.charAt(i);
	    	 		if (f!=' ')
	    	 		k+= s.charAt(i);
	     }
	     
	     System.out.println(k);
	}

}
