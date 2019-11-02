package JAVA_CODING_QUES;

import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {

		int array[];
		int k = 0,j;
		int array2[];
		array = new int [10];
		array2 = new int [10];
		
		System.out.println("Enter the first array");
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<10;i++)
		{	
			array [i] = input.nextInt();
		}
		
		for (int i=0;i<10;i++)
		{ 
			for(j=0;j<k;j++)
			{
			  if (array2[j]== array[i])
			  break;  
			}
		
		   if(j==k)
			{
			   array2[k]= array[i];
			   k++;
			}
		}

		System.out.println("Second array");
		for (j=0;j<k;j++)
        System.out.println(array2[j]);		
}
}
