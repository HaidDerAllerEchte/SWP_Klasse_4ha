package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;



public class RectangleTest {
	
	
	@Test
	public void calculateArea() {
		Rectangle r = new Rectangle(1, 2, 5, 5);
		double result = r.calculateArea();
		Assert.assertEquals(result, 5*5);
		
	}
	
	@Test
	public void calculateCircumference() {
		Rectangle r = new Rectangle(1, 2, 5, 5);
		double result = r.calculateCircumference();
		Assert.assertEquals(result, (5+5)*2);
}
}