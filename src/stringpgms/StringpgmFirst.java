package stringpgms;

public class StringpgmFirst {

	public static void main(String[] args) {
		// String Class
		
				//Concate
				
				String s="Hello";
				String s1="July Batch";
				String s2="hello";
				System.out.println(s.concat(s1));
				System.out.println(s+s1);
				System.out.println(2+3+s+5+6);
				
				
				//equals
				
				System.out.println(s.equals(s1));
				System.out.println(s.equalsIgnoreCase(s2));
				System.out.println(s.equals(s2));
				
				//toUpper and toLower
				
				System.out.println(s.toUpperCase());
				System.out.println(s1.toUpperCase());
				System.out.println(s1.toLowerCase());
				
				
				//Length
				
				System.out.println(s1.length());
				
				//startswith and endswith
				
				System.out.println(s1.startsWith("July"));
				System.out.println(s1.endsWith("Batch"));
				
				//Contains
				
				System.out.println(s1.contains("Batch"));
				
				//replace
				
				String s6="God is Great";
				System.out.println(s6.replace("Great", "Love"));
				
				
				//Trim
				
				String s3="         Welcome   ";
				String s4=s+s3;
				System.out.println(s4);
				String s5=s3.trim();
				System.out.println(s+s5);
				
				//Substring
				
				System.out.println(s6.substring(7));
				System.out.println(s6.substring(0, 3));
				
				//Split
				
				String s7="Hello Shinu Shaji";
				String[] st=s7.split(" ");
				for(String e:st)
				{
					System.out.println(e);
				}
				
				//toCharArray
				
				String s8="Hello";
				char[] c=s8.toCharArray();
				for(char ele:c)
				{
					System.out.println(ele);
				}
				
				
				
				
				
				
				
				
				

			}

		}


	


