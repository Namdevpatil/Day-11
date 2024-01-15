package javaValueBasedCollections;

public class Example1 {

	public static void main(String[] args) {
		
		String names[] = new String[4];
		
		names[0] = "A1";
		names[1] = "A2";
		names[2] = "A3";
		names[3] = "A4";
		
		
		for(String name: names)
		{
			System.out.println(name);
		}
		
	}

}
