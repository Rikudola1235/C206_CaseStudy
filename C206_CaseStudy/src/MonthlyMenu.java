
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20014059, 11 Aug 2021 2:50:18 pm
 */

public class MonthlyMenu {
	
	private String food;
	private int week;
	private String drink;
	
	public MonthlyMenu(int week, String food, String drink) {
		this.food = food;
		this.week = week;
		this.drink = drink;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}
	
	
	

}
