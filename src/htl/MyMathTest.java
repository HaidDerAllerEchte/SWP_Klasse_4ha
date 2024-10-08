package htl;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyMathTest {

	@Test
	public void testAddition() {
		MyMath mm = new MyMath();
		int result = mm.add(3,  5);
		Assert.assertEquals(result, 8);
		
	}
	
	@Test
	public void testSubtraction() {
		MyMath mm = new MyMath();
		int result = mm.subtract(5, 3);
		Assert.assertEquals(result, 2);
	}
	
	@Test
	public void testMulti() {
		MyMath mm = new MyMath();
		int result = mm.multiplikator(5, 3);
		Assert.assertEquals(result, 15);
	}
	
	@Test
	public void testDivide() {
		MyMath mm = new MyMath();
		double result = mm.divide(9, 5);
		Assert.assertEquals(result, 1.8);
	}
}
