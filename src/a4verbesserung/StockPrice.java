package a4verbesserung;

public class StockPrice extends Share{
	private double currentStockPrice;
	
	public double getCurrentStockPrice() {
		return this.currentStockPrice;
	}
	
	public void setCurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
		notify(currentStockPrice);
		
		
	}

}
