package exceptionTesting;

public class Aufgabe1  {

	public double sqrt(double value) {
		if (value < 0) {
			throw new IllegalArgumentException("value cannot be negativ");
		} else {
			value = Math.sqrt(value);
		}
		return value;
	}
}
