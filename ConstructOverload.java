package com.tns.septseventeen;
class practise{
	practise(int a , int b){
		System.out.println("This is constructor with 2 parameters");
		int product = a*b;
		System.out.println(product);
	}
	practise(int a, int b, int c) {
		System.out.println("This is constructor with 3 parameters");
		int product = a*b*c;
		System.out.println(product);
	}
	practise(String a, String b) {
		System.out.println("This is constructor with 2 String parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	practise(String a, int b) {
		System.out.println("This is constructor with a String and int parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	practise(int a, String b) {
		System.out.println("This is constructor with a int and String parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
}
public class ConstructOverload {

	public static void main(String[] args) {
		practise obj1 = new practise(1,2);
		practise obj2 = new practise(1,2,3);
		
	

	}

}
