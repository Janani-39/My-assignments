package week3.assignment1;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not	     
		/*
		 * Pseudo Code		
		 * a) Declare A String value as"madam"	 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 	 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String name ="madam";
		String name1="";
		int length=name.length();
		
		for (int i =length-1 ; i >=0; i--) 
           {
                
        	   name1 = name1 + name.charAt(i);
		}
		
			if(name.equals(name1))
			{
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
		

		
	}


