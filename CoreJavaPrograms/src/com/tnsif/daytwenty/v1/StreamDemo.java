package com.tnsif.daytwenty.v1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Aniket", "Programmer", 56000));
		empList.add(new Employee(102, "Vibhuti", "Analyst", 45000));
		empList.add(new Employee(103, "Sanket", "Tester", 45000));
		empList.add(new Employee(104, "Akanksha", "Programmer", 66000));
		empList.add(new Employee(105, "Prathmesh", "Analyst", 56000));
		empList.add(new Employee(106, "Pranav", "Programmer", 68000));

		System.out.println(empList);
		System.out.println("------------------------------------");
		
		Stream<Employee> empStream = empList.stream();

		
		Function<Employee, Float> inc = (emp) -> emp.getSalary() * 0.05f;
		List<Float> incentive = empStream.map(inc).toList();
		System.out.println("Incentives");
		System.out.println(incentive);
		System.out.println("--------------------------------------");
	
		empStream = empList.stream();
		Predicate<Employee> checkProgrammers = emp -> emp.getDesignation().equals("Programmer");
		empStream = empStream.filter(checkProgrammers);
		System.out.println("employee whose designation is Programmer");
		empStream.forEach(System.out::println);

		System.out.println("--------------------------------------");
		empStream = empList.stream();
		
		Predicate<Employee> salaryPredicate = emp -> emp.getSalary() <= 50000;
		empStream = empStream.filter(salaryPredicate);
		System.out.println("employee whose salary <=50000");
		empStream.forEach(System.out::println);

		System.out.println("----------------------------------------");
		
		empStream = empList.stream();
		Comparator<Employee> comp = (e1, e2) -> (int) (e1.getSalary() - e2.getSalary());
		Optional<Employee> result = empStream.min(comp);
		System.out.println("Lowest Salary : " + result.get().getSalary());
		System.out.println("-----------------------");

		salaryPredicate = emp -> emp.getSalary() == result.get().getSalary();
		empStream = empList.stream();
		empStream = empStream.filter(salaryPredicate);
		System.out.println("employee with lowest salary");
		empStream.forEach(System.out::println);

	}

}