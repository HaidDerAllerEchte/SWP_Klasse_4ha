package bankSystem;
 
public class OverdraftExeption extends Exception {
	
	public OverdraftExeption(String message) {
	        super(message);
	    }
}