package com.tnsif.dayFifteen.generics;

public class GenericConstructors {
private double v;

public <T extends Number>GenericConstructors(T t)
{
	v=t.doubleValue();
}
void show()
{
	System.out.println("Value of v in double type is: "+v);
}

}