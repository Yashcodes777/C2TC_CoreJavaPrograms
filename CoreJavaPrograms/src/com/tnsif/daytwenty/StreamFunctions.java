
package com.tnsif.daytwenty;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {
	
		
		public static long countEmptyStrings(Stream<String> stream) {
			long count = 0;
			count = stream.filter(x -> x.isEmpty()).count();
			return count;
		}

		
		public static long countStrings(Stream<String> stream, int n) {
			long num = stream.filter(x -> x.length() > n).count();
			return num;
		}

		
		public static List<String> nonEmptyStringList(Stream<String> stream) {
			List<String> filteredList = stream.filter(x -> !x.isEmpty()).collect(Collectors.toList());
			return filteredList;
		}

	
		public static List<String> getStrings(Stream<String> stream, int n) {
			List<String> filteredList = stream.filter(x -> x.length() > n).collect(Collectors.toList());
			return filteredList;
		}

		public static List<Integer> getSquareList(Stream<Integer> stream) {
			List<Integer> squareList = stream.distinct().map(i -> i * i).collect(Collectors.toList());
			return squareList;
		}
		
		public static void showStatistics(Stream<Integer> stream) {
			IntSummaryStatistics stats = stream.mapToInt((x) -> x).summaryStatistics();
			System.out.println("Highest number in List : " + stats.getMax());
			System.out.println("Lowest number in List : " + stats.getMin());
			System.out.println("Sum of all numbers : " + stats.getSum());
			System.out.println("Average of all numbers : " + stats.getAverage());
		}
	}