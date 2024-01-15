package javaSetCollections;

import java.util.HashSet;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("A1");
		names.add("A2");
		names.add("A5");
		names.add("D3");
		names.add("A2");//duplicate value
		names.add("A4");
		names.add("A52");

		for(String name: names)
		{
			System.out.println(name);
		}


	}

}
