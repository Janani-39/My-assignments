package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInCollection {

	public static void main(String[] args) {
		int[] num= {1,2,3,5,6,7};
		List<Integer> miss=new ArrayList<Integer>();
		for (Integer i : num) {
			miss.add(i);
		}
		Collections.sort(miss);
		System.out.println(miss);
		for (int i = 0; i < num.length; i++) {
			if(miss.get(i)!=(i+1))
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
