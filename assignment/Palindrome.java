package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343,r;
		int temp = num;
		int check=0;
		while(num>0) {
		r=num%10;
		check=(check*10)+r;
		num=num/10;
		}
        if (check==temp) {
			System.out.println("Given number is a palindrome");
		}
        else
        {
        	System.out.println("Given number is not a palindrome");
        }
	}

}
