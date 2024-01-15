package javaValueBasedCollections;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("A1");
		names.add("A2");
		names.add("A3");
		names.add("A4");
		names.add("A5");
		
		for(Object name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("==================");
		
		names.remove("A2");
		
		for(Object name: names)
		{
			System.out.println(name);
		}
		
	}

}
