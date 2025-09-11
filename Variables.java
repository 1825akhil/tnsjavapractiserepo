package com.tnstasksjava;

public class Variables {
	
	public void localVariable() {
		
		int b =20;
		System.out.println(b);
		}
	public static void main(String[] args) {
		int a=10;
		Variables obj = new Variables();
		System.out.println(a);
		obj.localVariable();

	}

}
