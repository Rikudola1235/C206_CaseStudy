
public class Items {
	
	private int itemID;
	private String category;
	private String name;
	private double price;

	public Items(int itemID, String category, String name, double price) {
		super();
		this.itemID = itemID;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
