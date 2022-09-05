package week1.day2.assignment;

public class Intersection {

	public static void main(String[] args) {
		int[]num1= {1,2,3,4,10,6,7};
		int[]num2= {2,8,9,7,10,12};
		for (int i = 0; i < num1.length; i++) {
			
			for (int j = 0; j < num2.length; j++) {
				
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]);
				}
			}
		}

	}

}
