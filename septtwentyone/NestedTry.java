package com.tns.septtwentyone;

public class NestedTry {

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			try {
				arr[3]=101;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("This is catch block for ArrayIndexOutOfBoundsException.");
			}
			int n = 10/0;
			System.out.println(n);
		}catch(Exception e) {
			System.out.println("This is catch block for ArithmaticException");
		}

	}

}
