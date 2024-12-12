package methodpgms;

import java.util.Scanner;

public class VowelsMethod {
	public static int vowelCount(String str) {
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
		count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String i= sc.nextLine();
		int vowelCount=vowelCount(i);
		System.out.println("Number of vowels in "+i+" is:"+vowelCount);
	
	}
	
}
