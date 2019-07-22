package com.test.ibm;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ibm.java.SumAndAverageOfInputs;


public class SumAndAverageOfInputsTest {
	OutputStream out;
	ByteArrayOutputStream myOutStream;

	SumAndAverageOfInputs obj;
	@Before
	public void init() {
		out = System.out;
		myOutStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOutStream));
	}

	@After
	public void clean() {
		System.setOut((PrintStream) out);
	}
	
	@Test
	public void UTC_01() {

		String []args = {"3", "3", "asd", "9"};
		String expectedResult = "THE SUM IS 12.0\n";
		expectedResult += "THE AVERAGE IS 6.0\n";
		expectedResult += "NUMERICAL INPUTS 2\n";
		expectedResult += "NON NUMERICAL INPUTS 1\n";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();
		System.out.println(actualResult);

		assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void UTC_02() {

		String []args = {"3", "3", "asd"};
		String expectedResult = "INSUFFICIENT INPUTS\n";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void UTC_03() {

		String []args = {};
		String expectedResult = "NO INPUT";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
