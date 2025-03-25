package bankSystem;
 
public class AccountTesting {
	public static void main(String[] args) {
        Account account = new Account("123456", 1000.0);
        //Test richtiges einzahlen
        try {
            account.deposit(100);
            System.out.println("Einzahlung erfolgreich");
        } catch (InvalidAmountExeption e) {
            System.out.println(e.getMessage());
        }
        //Test falsches einzahlen
        try {
            account.deposit(-100);
            System.out.println("Einzahlung erfolgreich");
        } catch (InvalidAmountExeption e) {
            System.out.println(e.getMessage());
        }
 
        //Test richtiges abheben
        try {
            account.withdraw(100);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountExeption | OverdraftExeption e) {
            System.out.println(e.getMessage());
        }
 
 
        //Negativen Betrag abgehoben
        try {
            account.withdraw(-10);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountExeption | OverdraftExeption e) {
            System.out.println(e.getMessage());
        }
        
        //Zuhohenbetrag abgehoben
        try {
            account.withdraw(9999);
            System.out.println("Abhebung erfolgreich");
        } catch (InvalidAmountExeption | OverdraftExeption e) {
            System.out.println(e.getMessage());
        }
    }
}
 