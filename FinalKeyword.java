package com.tns.septseventeen;
class test{
	final int a = 10;
	final void demo3(int a) {
		System.out.println("This is final method"+a);
	}
	void demo3() {
		System.out.println("This is a duplicate method");
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		test obj = new test();
		obj.demo3();

	}

}
