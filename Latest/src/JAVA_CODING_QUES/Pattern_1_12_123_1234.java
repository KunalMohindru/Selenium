package JAVA_CODING_QUES;

import java.util.Scanner;

public class Pattern_1_12_123_1234 {

	public static void main(String[] args) {
	
		System.out.println("Enter the number of rows");
     Scanner rows = new Scanner(System.in);
     int row = rows.nextInt();
     for (int i=1;i<=row;i++)
         {  
    	 for (int k=1;k<=i;k++)	 
    	 System.out.print(k);
    	 System.out.println("");
         }
	}

}
