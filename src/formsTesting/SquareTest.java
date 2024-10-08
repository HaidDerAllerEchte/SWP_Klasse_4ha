package formsTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
	
	@Test
	public void calculateArea() {
		Square s = new Square (1, 2,5, 5);
		double result = s.calculateArea();
		Assert.assertEquals(result, 5*5);
		
	}
}
