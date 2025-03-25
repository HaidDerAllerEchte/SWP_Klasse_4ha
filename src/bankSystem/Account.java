package bankSystem;
 
public class Account {
 
	private String accountNumber;
	private double balance;
	
	
 
	public Account(String accountNumber, double balance) {
	    this.accountNumber = accountNumber;
	    this.balance = balance;
	}
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
 
	public double getBalance() {
        return balance;
    }
	public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }
    
   
	public void deposit(double amount) throws InvalidAmountExeption {
	   if (amount <= 0) {
	       throw new InvalidAmountExeption("Der einzuzahlende Betrag muss größer sein als 0!");
	   }
	   this.balance = this.balance + amount;
	}
	
	
	public void withdraw(double amount) throws OverdraftExeption, InvalidAmountExeption {
	    if (amount <= 0) {
	        throw new InvalidAmountExeption("Der abgehobene Betrag muss größer sein als 0!");
	    }
	    if ((balance - amount) < 0) {
	        throw new OverdraftExeption("Nicht genuegend Guthaben! Waehle einen anderen Betrag! ");
	    }
	    this.balance = this.balance - amount;
	}
 
 
}