package com.tns.septtwentyone;

public class TryCatch {

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			arr[3]=101;
		}catch(Exception e) {
			System.out.println("This is Excpetion occured for Try-Catch demo program");
		}

	}

}
