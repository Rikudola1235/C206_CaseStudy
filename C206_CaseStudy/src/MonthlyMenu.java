
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20014059, 11 Aug 2021 2:50:18 pm
 */

public class MonthlyMenu {
	
	private String menuItem;
	private int month;
	
	public MonthlyMenu(String menuItem, int month) {
		this.menuItem = menuItem;
		this.month = month;
	}

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
