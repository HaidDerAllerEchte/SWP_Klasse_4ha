package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;



public class RectangleTest {
	
	
	@Test
	public void calculateArea1() throws widthException {
		Rectangle r = new Rectangle(1, 2, 5, 5);
		double result = r.calculateArea();
		Assert.assertEquals(result, r.getLength()*r.getWidth());
		
	}
	
	@Test
	public void calculateArea2() throws widthException {
		Rectangle r = new Rectangle(1, 2, 5, 0);
		double result = r.calculateArea();
		Assert.assertEquals(result, r.getLength()*r.getWidth());
		
	}
	
	@Test
	public void calculateCircumference1() throws widthException {
		Rectangle r = new Rectangle(1, 2, 5, 5);
		double result = r.calculateCircumference();
		Assert.assertEquals(result, (r.getLength()*r.getWidth())*2);
}
	
	@Test
	public void calculateCircumference2() throws widthException {
		Rectangle r = new Rectangle(1, 2, 5, 0);
		double result = r.calculateCircumference();
		Assert.assertEquals(result, (r.getLength()*r.getWidth())*2);
}
}