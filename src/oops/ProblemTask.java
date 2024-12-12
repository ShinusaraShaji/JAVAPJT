package oops;

import java.util.Scanner;

public class ProblemTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String input=sc.nextLine();
		String[]words=input.split(" ");
		String r="";
		for(int i=words.length-1;i>=0;i--) {
			r+=words[i]+" ";
			}
		System.out.println(r.trim());
		

	}

}


