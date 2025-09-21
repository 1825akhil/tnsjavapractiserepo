package com.tns.septnineteen;

public class SrtingsDemo {

	public static void main(String[] args) {
		//string
		String str = "Strings";
		System.out.println(str+ " Normal");
		
		//string buffer
		StringBuffer stb = new StringBuffer("String");
		stb.append(" Buffer");
		System.out.println(stb);
		
		//string builder
		StringBuilder stbu = new StringBuilder("String");
		stbu.append(" Builder");
		System.out.println(stbu);
	}

}
