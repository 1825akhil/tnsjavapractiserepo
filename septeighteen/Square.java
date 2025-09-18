package com.tns.septeighteen;

public class Square extends Shape {
	int side = 2;
	public Square(int s) {
		this.side=s;
	}
	public void calArea(){
		super.area = side*side;
	}
}
