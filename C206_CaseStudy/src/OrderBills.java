/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Caleb
 * Student ID: 20000472
 * Class: E65D
 * Date/Time created: Sunday 15-08-2021 17:45
 */

public class OrderBills {
	private int amount;
	private String items;
	private int billNo;
	
	
	public OrderBills(int amount, String items, int billNo) {
		this.amount = amount;
		this.items = items;
		this.billNo = billNo;
	}


	public int getAmount() {
		return amount;
	}


	public String getItems() {
		return items;
	}


	public int getBillNo() {
		return billNo;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public void setItems(String item) {
		this.items = item;
	}


	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	
	
	

}
