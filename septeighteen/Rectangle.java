package com.tns.septeighteen;

public class Rectangle extends Shape {
	int height = 2, width = 3;
	public Rectangle(int h , int w) {
		this.height=h;
		this.width=w;
	}
	public void calArea(){
		super.area = height*width;
	}
}
