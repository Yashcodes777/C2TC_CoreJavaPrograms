package com.tnsif.dayFifteen.generics;

public class MinMaxImpI<T extends Comparable<T>> implements MinMax<T> {
	T[] values;

	MinMaxImpI(T[] obj) {
		values = obj;
	}

	@Override
	public T min() {
		T o1 = values[0];

		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) < 0)
				o1 = values[i];
		return o1;
	}

	@Override
	public T max() {
		T o1 = values[0];
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) > 0)
				o1 = values[i];
		return o1;
	}
}