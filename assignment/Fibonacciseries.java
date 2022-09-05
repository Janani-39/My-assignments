package week1.day2.assignment;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n=5,sum=0;
		int num1=0,num2=1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 1; i<=n; i++) {
			
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);
		}
		
	}

}
