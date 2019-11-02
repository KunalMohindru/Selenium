package JAVA_CODING_QUES;

import java.util.Scanner;

public class Pallindrome_String {

	public static void main(String[] args) {
		

		System.out.println("Enter the string    :");

		 Scanner Input = new Scanner (System.in);     
	     String s =Input.nextLine();
	     String k= ""; 
	     int m =0;
	     int len = s.length();
	     
	     for (int i=len-1;i>=0; i--)
	     { 
	    	 k+= s.charAt(i);
	    	      }
	     
	     if (s.compareTo(k)==0)
	     System.out.println("Pallindrome String");
	     
	     else 
	    	 
	    	 System.out.println(" Not Pallindrome String");	

		}

	}


