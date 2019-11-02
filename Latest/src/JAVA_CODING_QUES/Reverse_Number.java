package JAVA_CODING_QUES;

import java.io.InputStream;
import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
        System.out.println("Enter the input string:");
		Scanner k = new Scanner(System.in);
		int a = k.nextInt();
		
		int d=0;
		
		while(a>0)
		
		{
			int  b = a%10;
			d=d*10 + b;
			a= a/10;
		}
		
	System.out.println(d);		
			
	}

}
