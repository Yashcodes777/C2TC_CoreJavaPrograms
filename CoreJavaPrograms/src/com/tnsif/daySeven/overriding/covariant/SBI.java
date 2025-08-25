//Program to demonstrate method overriding - Runtime Polymorphism
package com.tnsif.daySeven.overriding.covariant;

//subclass
public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}