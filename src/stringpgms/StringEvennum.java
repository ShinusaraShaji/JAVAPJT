package stringpgms;

import java.util.Scanner;

public class StringEvennum {

	public static void main(String[] args) {
	    //String even words
		
		System.out.println("Enter a Sentence:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] words= s.split(" ");
		System.out.println("Even-length words:");
		for(String w:words)
		{
			if(w.length()% 2==0)
			{
				System.out.println(w);
			}
		}
		
			
			
		
		
		

	}

}
