package javaListCollections;

import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {

		//ArrayList<Employee> employeeList = new ArrayList<Employee>();

		List<Employee> employeeList1 = new ArrayList<Employee>();

		employeeList1.add(new Employee(101, "dinesh", "Tester"));
		employeeList1.add(new Employee(111, "sham", "Architect"));
		employeeList1.add(new Employee(102, "kumar", "Senior Recruiter"));
		employeeList1.add(new Employee(105, "raj", "Java Developer"));
		employeeList1.add(new Employee(109, "rakesh", "Business Anylyst"));
		employeeList1.add(new Employee(101, "dinesh", "Tester"));


		for(Employee employee: employeeList1)
		{
			System.out.println(employee.toString());
		}

		System.out.println("=====================================================");

		List<Employee> employeeList2 = new ArrayList<Employee>();
		employeeList2.add(new Employee(123, "lalit", "Junior Developer"));
		employeeList2.addAll(employeeList1);

		for(Employee employee: employeeList2)
		{
			System.out.println(employee.toString());
		}

		

	}

}
