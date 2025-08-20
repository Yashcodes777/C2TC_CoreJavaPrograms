package com.tnsif.daySix.usingfinal;

public class FinalClassDemo {
	void show() {
		System.out.println("Final class cannot be inherited");
	}

}
class FinalChildClass extends FinalClass {
	
}
public class FinalClassDemo{
	public static void main(String[] args) {
		FinalClass f1 = new FinalClass();
		f1.show();
	}
}
