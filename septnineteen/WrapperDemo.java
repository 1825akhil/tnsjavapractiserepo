package com.tns.septnineteen;

public class WrapperDemo {

	public static void main(String[] args) {
		//auto-boxing 3 examples
		int num =5;
		Integer num1 = num;
		
		double dob = 5.0;
		Double dob1 = dob;
		
		char ch = 'A';
		Character ch1 = ch;
	//auto-unboxing 3 examples
		int num2 = num1;
		double dob2 = dob1;
		char ch2 = ch1;
		System.out.println("Auto-Boxing Variables:"+num1+" "+" "+dob1+" "+ch1);
		System.out.println("Auto-UnBoxing Variables:"+num2+" "+" "+dob2+" "+ch2);
		
	}
}
