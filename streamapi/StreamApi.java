package com.tns.streamapi;

import java.util.*;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3,0,9,4,5);
		nums.stream()
					.filter(n->n%2==1)
					.sorted()
					.map(n->n*2)
					.forEach(n->System.out.println(n));
		
		
	}

}
