package week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String name="We learn java basics as part of java sessions in java week1";
		String[] split = name.split(" ");
		Set<String> text=new LinkedHashSet<String>();
		for(String i : split)
		{
			text.add(i);
		}
            System.out.println(text);
	}

}
