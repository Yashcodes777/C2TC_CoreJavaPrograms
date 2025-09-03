package com.tnsif.dayFifteen.generics;

import java.util.ArrayList;

public class UpperBoundedWildCardDemo {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		System.out.println("sum = " + UpperBoundedWildCard.sumOfList(intList));

		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(10.0);
		doubleList.add(20.0);
		doubleList.add(30.0);
		System.out.println("sum = " + UpperBoundedWildCard.sumOfList(doubleList));
		
		}
}