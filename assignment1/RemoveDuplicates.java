package week3.assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1"; b) Initialize
		 * an integer variable as count c) Split the String into array and iterate over
		 * it d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. f) if the count > 1 then
		 * replace the word as "" g) Displaying the String without duplicate words
		 */

		String str ="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] str1 = str.split(" ");
		//System.out.println(text1[1]);
		for(int i =0 ;i<str1.length;i++) {
			for(int j = i+1;j < str1.length;j++) {
				if(str1[i].equals(str1[j])) {
					str1[j]="";
					count++;
				}
			}
		}
		if(count>1) {
			
				System.out.print(Arrays.toString(str1));
			
		}
		
	}

	}


