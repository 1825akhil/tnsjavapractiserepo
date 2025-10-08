package com.tns.testingjunit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.Test;

public class AssertDemo {
		
	 @Test
	   public void testAssertNull() {	        
	        Object obj = null;
	        assertNull(obj, "Object should be null");
	    }
	 
	  @Test
	  public void testAssertEquals() {
	      int a = 10;
	      int b = 10;
	        assertEquals(a, b, "They are same");
	    }
}
