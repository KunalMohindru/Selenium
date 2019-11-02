package JAVA_CODING_QUES;

import java.util.Scanner;

public class Count_of_each_word_in_string {

	public static void main(String[] args) {

	 int count=0;
		Scanner input  = new Scanner (System.in);
		System.out.println("Enter the sentence   :");
		String sentence = input.nextLine(); 
		
		System.out.println("Enter the word to be searched   :");
		String word = input.nextLine(); 
		
		String k[] = sentence.split(" ");
	
	for (int i=0;i<k.length;i++)
	{
	if (k[i].equals(word))
		count++;
	}
	
	System.out.println("Number of occurance of the word is   : " + count);

	}

}
