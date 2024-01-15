package javaSetCollections;

import java.util.Comparator;

public class SortByEmployeeDesignation implements Comparator<Employee> 
{

	@Override
	public int compare(Employee e1, Employee e2) 
	{		
		return e1.getDesignation().compareTo(e2.getDesignation());
	}

}
