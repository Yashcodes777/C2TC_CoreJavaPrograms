package com.tnsif.dayEight.absraction;


public class AbstractDemo {

	public static void main(String[] args) {
		Sqaure sq=new Sqaure();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		
		
		Shape shape;
		shape=new Sqaure(12.5f);
		
		shape.calArea(); 
		shape.show();
		
		shape=new Rectangle(10,20);
		
		shape.calArea(); 
		shape.show();
		

	}

}