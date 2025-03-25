package a4verbesserung;

public class BrokerClient implements Broker {
	
	private double currentStockPrice;
	
	private void setCurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
	}
	
	
	public void update (double currentStockPrice ) {
		this.setCurrentStockPrice(currentStockPrice);
	}
	
	public double getCurrentStockPrice() {
		return currentStockPrice;
	}
	

}
