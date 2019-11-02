package JAVA_CODING_QUES;

import java.util.List;
import java.util.Scanner;

public class Replace_String_with_another_Substring {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scan = new Scanner (System.in);
		String sentence = scan.nextLine();
		
		System.out.println("Enter the word to be replaced");
		String word = scan.nextLine();
		
		System.out.println("Enter the new word");
		String newword = scan.nextLine();
		
	String strrray[] = sentence.split(" ");
		
		int length = strrray.length;
		
	/*	for (int i=0;i<length;i++)
       { 
			if(strrray[i].equals(word))
    	    strrray[i].replace(word, newword);
    	  
       }
	//	sentence.replaceAll(word, newword);
		for (int i=0;i<length;i++)
		System.out.println(strrray[i]);
		*/
	}

}
