package com.tnsif.dayEight.absraction;

public class Sqaure extends Shape{
	private float side;
	public Sqaure()
	{
		side=2.0f;
	}
	public Sqaure(float side)
	{
		this.side=side;
	}
	
	@Override
	void calArea() {
		super.area=side*side;		
	}
}