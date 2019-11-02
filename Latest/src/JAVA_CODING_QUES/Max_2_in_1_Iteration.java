package JAVA_CODING_QUES;

import java.util.Scanner;

public class Max_2_in_1_Iteration {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array string");

	// input
		
	int array [];
	array = new int [10];
	
	for (int i=0; i<10;i++)
	{ 
		array[i]= scan.nextInt();
	}

	//print
	
	for (int i=0; i<10;i++)
	{ 
		System.out.println(array[i]);
	}

	

	int Max = array[0];
	int Max2 = 0;
	
	for (int i=1; i<10;i++)
	{ 
		 if (array[i]>Max2 && array[i]<Max)
        {
			
            Max2= array [i];
		}
	}
	
	
	System.out.println("Max number is     :"+ Max);
	System.out.println("Second Max number is     :"+ Max2);
		
	}

}
