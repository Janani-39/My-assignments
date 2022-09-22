package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		List<Integer> arr1=new ArrayList<Integer>();
		for (Integer i : arr) {
			arr1.add(i);
		}
		Collections.sort(arr1);
		System.out.println(arr1);
		List<Integer>arr2=arr1;
        List<Integer>arr3= new ArrayList<Integer>();
        count=0;
        for (int i = 0; i < arr1.size(); i++) {
			
        	for (int j = i+1; j < arr2.size(); j++) {
				if(arr1.get(i).equals(arr2.get(j)))
				{
					arr3.add(arr2.get(j));
					count++;
				}
        		
			}
		}
        if(count>0)
        {
        	System.out.println("The duplicate number: "+arr3);
        }
        else
        {
        	System.out.println("No Duplicate numbers");
        }
	}

}
