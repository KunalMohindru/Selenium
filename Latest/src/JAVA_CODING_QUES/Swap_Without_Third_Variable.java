package JAVA_CODING_QUES;

import java.util.Scanner;

public class Swap_Without_Third_Variable {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = in.nextInt();
		
		System.out.println("Enter Second number");
		int b = in.nextInt();
		
		a=a+b;
		b = a-b;
		a=a-b;
		
		System.out.println("Swapped numbs a:    " + a + "    "  + "Swapped numbs b:      " + b);

		

	}

}