package com.tnsif.dayFifteen.generics;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		Float arr[] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
		MinMaxImpl<Float> objOne = new MinMaxImpl<Float>(arr);
		System.out.println("Minimum value is : " + objOne.min());
		System.out.println("Maximum value is : " + objOne.max());
		
	
		String arrOne[] = { "Ankit", "Pooja", "Neha", "Sakshi", "Amol" };
		MinMaxImpl<String> objTwo = new MinMaxImpl<String>(arrOne);
		System.out.println("Minimum value is : " + objTwo.min());
		System.out.println("Maximum value is : " + objTwo.max());
		
		Person p[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		MinMaxImpl<Person> objThree = new MinMaxImpl<Person>(p);
		System.out.println("Minimum value is : " + objThree.min());
		System.out.println("Maximum value is : " + objThree.max());

	}

}