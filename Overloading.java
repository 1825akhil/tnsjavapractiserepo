package com.tns.septseventeen;
class method1{
	public void mdemo(int a , int b){
		System.out.println("This is method with 2 parameters");
		int product = a*b;
		System.out.println(product);
	}
	public void mdemo(int a, int b, int c) {
		System.out.println("This is method with 3 parameters");
		int product = a*b*c;
		System.out.println(product);
	}
	public void mdemo(String a, String b) {
		System.out.println("This is method with 2 String parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	public void mdemo(String a, int b) {
		System.out.println("This is method with a String and int parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	public void mdemo(int a, String b) {
		System.out.println("This is method with a int and String parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	
}
public class Overloading {

	public static void main(String[] args) {
		method1 obj = new method1();
		obj.mdemo(1,2);
		obj.mdemo(1,2,3);
		obj.mdemo("Akhil","Nallapu");
		obj.mdemo("Akhil", 201);
		obj.mdemo(201, "Akhil");

	}

}
