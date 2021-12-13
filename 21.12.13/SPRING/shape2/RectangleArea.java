package com.javalec.ex.shape2;

public class RectangleArea implements Shape {
 public double height; 
 public double width;
 
 public RectangleArea() {}
 
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double) this.width * this.height ;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;

	}

}
