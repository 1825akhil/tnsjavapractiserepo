package com.tnstasksjava;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n = sc.nextInt();
	sc.close();
	int temp=n;
	int rev=0;
	while(temp>0) {
		rev =(rev*10)+temp%10;
		temp=temp/10;
	}
	if(rev==n) {
		System.out.println(n+" is Palindrome");
	}else {
		System.out.println(n+" is not palindrome");
	}
}
}
