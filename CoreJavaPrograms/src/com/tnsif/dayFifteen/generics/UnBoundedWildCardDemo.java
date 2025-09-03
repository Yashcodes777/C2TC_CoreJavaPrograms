package com.tnsif.dayFifteen.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.println("Display Integer values");
		UnBoundedWildCard.display(intList);

		List<String> strList = Arrays.asList("Hi", "Hello", "How are you");
		System.out.println("Display String values");
		UnBoundedWildCard.display(strList);
		
		Person persons[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		List<Person> personList = Arrays.asList(persons);
		System.out.println("Display Person values");
		UnBoundedWildCard.display(personList);
	}
}