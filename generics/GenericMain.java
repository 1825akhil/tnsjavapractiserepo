package com.tns.generics;

public class GenericMain {

	public static void main(String[] args) {
		//Integer type
		GenericDemo<Integer> num = new GenericDemo<>();
		num.setPrintElement(100);
		System.out.println(num.getPrintElement());
		
		//String type
		GenericDemo<String> str = new GenericDemo<>();
		str.setPrintElement("AKhil");
		System.out.println(str.getPrintElement());

	}

}
