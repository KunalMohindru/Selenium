package JAVA_CODING_QUES;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) 
{
		
		
		System.out.println("Enter the number:");
		Scanner k = new Scanner(System.in);
		int a = k.nextInt();
		int e=a;
		int d=0;
		
		while(a>0)
		
		{
			int  b = a%10;
			d=d*10 + b;
			a= a/10;
		}
	
		System.out.println("The number d    :" + d);
		
		if(e==d)
			System.out.println("Pallindrome number");
		else
	System.out.println("Not a Pallindrome number");	
}

}
