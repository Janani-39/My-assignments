package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		List<Integer> num1=new ArrayList<Integer>();
               for (Integer i : num) {
                      num1.add(i);	
            }
               Collections.sort(num1);
               System.out.println(num1);
               System.out.println("the second largest number is: "+num1.get(num1.size()-2));
	}

}
