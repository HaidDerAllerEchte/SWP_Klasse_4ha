package exceptionTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Aufgabe2Test {

	@Test(expectedExceptions = NullPointerException.class)
	public void sqrtTest() throws NullPointerException {
		Aufgabe2 a = new Aufgabe2();
		a.reverse(null);
}
}