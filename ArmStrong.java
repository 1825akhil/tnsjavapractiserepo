package com.tnstasksjava;
import java.util.*;
public class ArmStrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n = sc.nextInt();
	sc.close();
	int len = String.valueOf(n).length();
	int temp=n;
	int sum=0;
	while(temp>0) {
		sum +=(int) Math.pow(temp%10,len);
		temp=temp/10;
	}
	if(sum==n) {
		System.out.println(n+" is a Armstrong Number");
	}else {
		System.out.println(n+" is not a Armstrong Number");
	}
}
}
