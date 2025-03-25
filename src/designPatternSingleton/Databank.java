package designPatternSingleton;


public class Databank {
	
	private Databank() {}
	
	private static class BankHolder {
		private final static Databank INSTANCE = new Databank();
		
	}
	
	public static Databank getInstance(){
		return BankHolder.INSTANCE;
		
	}
	
	public void Message(String message) {
		System.out.println("[] " + message);
	}
	}


