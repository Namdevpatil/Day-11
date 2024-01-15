package javaValueBasedCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {

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
		//names.add(null);
		
		Iterator iterator = names.iterator();
		
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			
			if(value.equals(100))
			{
				iterator.remove();
			}
		}
		
		
		names.remove("A1");
		
		for(Object name: names)
		{
			System.out.println(name);
		}
		
	}

}
