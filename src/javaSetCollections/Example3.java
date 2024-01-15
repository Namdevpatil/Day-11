package javaSetCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {

		//ArrayList<Employee> employeeList = new ArrayList<Employee>();

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(101, "dinesh", "Tester"));
		employeeList.add(new Employee(111, "sham", "Architect"));
		employeeList.add(new Employee(102, "kumar", "Senior Recruiter"));
		employeeList.add(new Employee(105, "raj", "Java Developer"));
		employeeList.add(new Employee(109, "rakesh", "Business Anylyst"));
		employeeList.add(new Employee(101, "dinesh", "Tester"));


		for(Employee employee: employeeList)
		{
			System.out.println(employee.toString());
		}

		System.out.println("=========================by id============================");

		Collections.sort(employeeList, new SortByEmployeeId());
		
		for(Employee employee: employeeList)
		{
			System.out.println(employee.toString());
		}	
		
		System.out.println("=========================by designation============================");

		Collections.sort(employeeList, new SortByEmployeeDesignation());
		
		for(Employee employee: employeeList)
		{
			System.out.println(employee.toString());
		}
		
		System.out.println("=========================get list============================");
		
		System.out.println(employeeList.toString());

	}

}
