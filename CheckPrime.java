package com.tnstasksjava;
import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		sc.close();
		for(int i = 2;i<=n; i++) {
			if(n%i!=0 || n==2) {
				System.out.println(n+" is a Prime Numner");
				break;
			}else {
				System.out.println(n+" is not a Prime Numner");
				break;
			}
		}

	}

}
