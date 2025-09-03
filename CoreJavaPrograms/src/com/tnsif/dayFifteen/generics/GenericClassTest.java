package com.tnsif.dayFifteen.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<String> stringObj=new GenericClass<String>();
		stringObj.set("Hello");
		System.out.println(stringObj.get());

		GenericClass<Integer> integerObj=new GenericClass<Integer>();
		integerObj.set(10);
		System.out.println(integerObj.get());
		
		GenericClass<Person> personObj=new GenericClass<Person>();
		personObj.set(new Person("Ajay","Chennai"));
		System.out.println(personObj.get());
	}
}