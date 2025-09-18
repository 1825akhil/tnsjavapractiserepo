package com.tns.septeighteen;

public abstract class Shape {
		protected int area;
		abstract void calArea();
		public void show() {
			System.out.println("The area of shape is "+area);
		}
}
