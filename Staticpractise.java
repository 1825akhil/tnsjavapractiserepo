package com.tns.septseventeen;
class demo2{
	static int a = 10;
	static void method() {
		System.out.println("This is a Static Method");
	}
	static{
		System.out.println("This is a Static Block");
	}
}
public class Staticpractise {

	public static void main(String[] args) {
		demo2 obj = new demo2();
			demo2.method();
	}

}
