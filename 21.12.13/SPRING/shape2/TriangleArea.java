package com.javalec.ex.shape2;

public class TriangleArea implements Shape {
 public double height; 
 public double width;
 
 public TriangleArea() {}
 
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double) this.width * this.height / 2.0;
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
