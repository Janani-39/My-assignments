package week3.assignment1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code 
		 * Declare String Input as Follow 
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 */

		
		String name="changeme";
		char[] name1 = name.toCharArray();
        for (int i = 0; i < name1.length; i++) {
          if(i%2!=0)
          {
             name1[i]=Character.toUpperCase(name1[i]);
          
          }
          else
          {
        	  name1[i]=Character.toLowerCase(name1[i]);
          }
        	
        	
		}	
		
		System.out.println(name1);
	}

}
