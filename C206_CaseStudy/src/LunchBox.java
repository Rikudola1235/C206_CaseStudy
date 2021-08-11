
public class LunchBox {
	private String lunchboxName;
	private String category;
	private double price;
	
	public LunchBox(String lunchboxName, String category, double price) {
		this.lunchboxName = lunchboxName;
		this.category = category;
		this.price = price;
	}
	
	public String getLunchBoxName() {
		return lunchboxName;
	}

	public String getCategory() {
		return category;
	}
	
	public double getPrice() {
		return price;
	}
}
