package com.tnsif.daytwenty;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionsDemo {
	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Nashik", "", "Bangalore", "", "Chennai", "Mumbai", "Pune"); // source
		System.out.println("List of Cities is " + strList);

	
		Stream<String> stream = strList.stream();

		
		long count = StreamFunctions.countEmptyStrings(stream);
		System.out.printf("List %s has %d empty strings \n", strList, count);
	

		count = StreamFunctions.countStrings(strList.stream(), 8);
		System.out.printf("List %s has %d strings of length more than 8 \n", strList, count);

		
		List<String> filteredList = StreamFunctions.nonEmptyStringList(strList.stream());
		System.out.printf("Original List : %s, List without Empty Strings : %s \n", strList, filteredList);

		
		filteredList = StreamFunctions.getStrings(strList.stream(), 6);
		System.out.printf("Original List : %s, Cities length more than 6: %s %n", strList, filteredList);

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		
		Stream<Integer> stream1 = numbers.stream();

		
		List<Integer> filteredNumberList = StreamFunctions.getSquareList(stream1);
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, filteredNumberList);

		
		StreamFunctions.showStatistics(numbers.stream());

	}

}