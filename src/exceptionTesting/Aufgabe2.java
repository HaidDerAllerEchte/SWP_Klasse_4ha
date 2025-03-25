package exceptionTesting;

public class Aufgabe2 {

	public String reverse(String input) throws NullPointerException{
		if (input == null) {
			throw new NullPointerException("It cannot be null");
		} 
			
		return input;
	}
	}
	

