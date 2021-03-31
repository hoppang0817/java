package discountRate;

public class MarketGood {

	private String name;
	private int retailPrice;
	private int discountRate;

	
	
	
	
	public MarketGood() {
	
	}



	public MarketGood(String name, int retailPrice, int discountRate) {
		this.name = name;
		this.retailPrice = retailPrice;
		//if하고 else 꼭해주자 안하면 오류남
		if(this.discountRate<0 || this.discountRate>100) {
			this.discountRate=0;
		}else {
			this.discountRate = discountRate;
		}
	}



	public MarketGood(String name, int retailPrice) {
		this.name = name;
		this.retailPrice = retailPrice;
		this.discountRate =0;
	}



	public int getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRetailPrice() {
		return retailPrice;
	}
	
	public int getDiscountedPrice() {
	 return (int) this.retailPrice * (100-this.discountRate)/100;	
	}
}
