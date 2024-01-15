package javaValueBasedCollections;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList names = new ArrayList<>();
		
		names.add("A1");
		names.add("A2");
		names.add("A3");
		names.add("A4");
		names.add(false);
		names.add("A5");
		names.add(100);
		names.add(false);
		names.add(null);
		
		for(Object name: names)
		{
			System.out.println(name);
		}
		
		System.out.println("==================");
		
		names.remove("A1");
		
		for(Object name: names)
		{
			System.out.println(name);
		}
		
	}

}
