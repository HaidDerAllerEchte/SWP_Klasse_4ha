package exceptionTesting;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Aufgabe1Test {

	@Test
	public void sqrtTest() throws IllegalArgumentException {
		Aufgabe1 a = new Aufgabe1();
		double result = a.sqrt(16);
		Assert.assertEquals(result,(4));
}
	
	@Test
	public void sqrtTest1() throws IllegalArgumentException {
		Aufgabe1 a = new Aufgabe1();
		double result = a.sqrt(-16);
		Assert.assertEquals(result,(-4));
}
}