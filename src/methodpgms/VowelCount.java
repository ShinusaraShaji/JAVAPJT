package methodpgms;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// Vowel Count in word
		
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		VowelCount v=new VowelCount();//classname new counstructor
		int count= v.vowelCount(s);
		System.out.println("Count of vowels in the word ="+count);	
	}
	
	
	
	public int vowelCount(String s)//method create
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
		{
		  count++;
		}}
		return count;
		}
		}
	


