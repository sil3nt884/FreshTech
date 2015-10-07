package com.netbuilder.entities;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SupplierTest {
	Supplier tester;
	
	/**
	 *  By using @BeforeClass - we can make sure that our test object is instantiated
	 *  
	 *  The remaining test methods use @Test and assertEquals() to validate test data
	 *  
	 */
	
	@BeforeClass
	public void testConstructor(){
		tester = new Supplier(321, "Test", "3@2.1", 12321, "Phone");
	}
	
	@Test
	public void testGetId(){
		int result = tester.getId();
		assertEquals(result, 321);
	}
	
	@Test
	public void testSetId(){
		int num = 123;
		tester.setId(num);
		assertEquals(tester.getId(), num);
	}
	
	@Test
	public void testGetName(){
		String result = tester.getName();
		assertEquals(result, 321);
	}
	
	@Test
	public void testSetName(){
		String result = "Result";
		tester.setName(result);
		assertEquals(tester.getName(), result);
	}
	
	public void testGetEmail(){
		String result = tester.getEmail();
		assertEquals(result, "3@2.1");
	}
	
	@Test
	public void testSetEmail(){
		String result = "1@2.3";
		tester.setEmail(result);
		assertEquals(tester.getName(), result);
	}
	
	@Test
	public void testGetPhone(){
		int result = tester.getPhone();
		assertEquals(result, 12321);
	}
	
	@Test
	public void testSetPhone(){
		int num = 54345;
		tester.setId(num);
		assertEquals(tester.getPhone(), num);
	}
	
	@Test
	public void testGetPreferredContactMethod(){
		String result = tester.getPreferredContactMethod();
		assertEquals(result, "Phone");
	}
	
	@Test
	public void testSetPreferredContactMethod(){
		String result = "Email";
		tester.setPreferredContactMethod(result);
		assertEquals(tester.getPreferredContactMethod(), result);
	}
}
