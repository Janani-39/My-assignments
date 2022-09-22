package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7};
		int[] arr2= {9,8,7,5,3,0,1};
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for (Integer i : arr1) {
			list1.add(i);
		}
		for (Integer j : arr2) {
			list2.add(j);
		}
         for(int i=0; i < list1.size();i++)
         {
        	 for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i)==list2.get(j))
						{
		System.out.println("The intersected numbers: "+list1.get(i));
						}
			}
         }
	}

	

}
