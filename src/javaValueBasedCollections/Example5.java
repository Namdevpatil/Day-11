package javaValueBasedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("A1");
		names.add("A2");
		
		names.add("A5");
		names.add("A3");
		names.add("A4");
		
		for(Object name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("==================");
		
		Collections.sort(names);
			
		System.out.println(names);
		
	}

}
