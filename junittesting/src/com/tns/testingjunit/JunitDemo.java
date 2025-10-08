package com.tns.testingjunit;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("Display name annotation")
public class JunitDemo {
	
	
	@Test
	public void test1() {
		System.out.println("test1 method is success");
	}
	
	@RepeatedTest(2)
	public void test2() {
		System.out.println("test2 method is success");
	}
	
	@Ignore
	public void test3() {
		System.out.println("test3 method is success");
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Akhil", "Manish", "Azlan"})
	public void test4(String name) {
		assertTrue(name.endsWith("l"));
		System.out.println("test4 method is success");
	}
}
