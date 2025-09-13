package com.tnstasksjava;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(2+"\n"+3+"\n"+5+"\n"+7);
		int count = 4;
		for(int i=2;i<=100;i++) {
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
				System.out.println(i);
				count++;
			}
		}
			System.out.println("Total Number of Prime numbers between 1 to 100 is "+ count);
	}

}
