import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<LunchBox> lunchboxList = new ArrayList<LunchBox>();

//		ArrayList<UserAccount> userAcctList = new ArrayList<UserAccount>();

		// accountList to store account
		ArrayList<Account> accountList = new ArrayList<Account>();
		// data
		accountList.add(new Account("Parent", "parent1", "parentPW1", 11110001));
		accountList.add(new Account("Parent", "parent2", "parentPW2", 11110002));
		accountList.add(new Account("Parent", "parent3", "parentPW3", 11110003));
		
		ArrayList<LunchBox> orderList = new ArrayList<LunchBox>();

		ArrayList<MonthlyMenu> monthlyList = new ArrayList<MonthlyMenu>();

		ArrayList<Drinks> drinkList = new ArrayList<Drinks>();

		ArrayList<Items> itemList = new ArrayList<Items>();

		// add user account
//		userAcctList.add(new UserAccount(1, "Matthew", "T0313194c", "Student"));

		// add lunchbox to arraylist
		lunchboxList.add(new LunchBox("Tuna Sandwich", "Vegetarian Food", 2.50));
		lunchboxList.add(new LunchBox("Chicken Cutlet Rice", "Western Food", 5.00));
		lunchboxList.add(new LunchBox("Char Kuay Teow", "Asian Food", 4.00));

		itemList.add(new Items("Spaghetti", "Western"));
		itemList.add(new Items("Baked Rice", "Western"));
		itemList.add(new Items("Black Bean Noodle", "Korean"));
		itemList.add(new Items("Chicken Rice", "Asian"));
		itemList.add(new Items("Vegetarian Noodles", "Vegetarian"));

		drinkList.add(new Drinks("Iced Milo"));
		drinkList.add(new Drinks("Iced Bandung"));
		drinkList.add(new Drinks("Plain Water"));
		drinkList.add(new Drinks("Orange Juice"));
		drinkList.add(new Drinks("Apple Juice"));

		int option = 0;

		while (option != 3) {

			C206_CaseStudy.MainMenu();
			option = Helper.readInt("Enter an option > ");

			while (option != 4) {
				if (option == 1) {
					// View Staff Menu
					C206_CaseStudy.StaffMenu();
					int staffoption = Helper.readInt("Enter an option > ");

					if (staffoption == 1) {
						// Monthly Menu
						C206_CaseStudy.StaffMenu1();
						int mmoption = Helper.readInt("Enter an option > ");

						if (mmoption == 1) {
							// Create Monthly Menu

							if (monthlyList.isEmpty()) {
								char choice = Helper
										.readChar("Would you like to generate Monthly Menu automatically (y/n) > ");

								if (choice == 'y' || choice == 'Y') {
									generateRandomMonthlyMenu(monthlyList, drinkList, itemList);
								}

								else if (choice == 'n' || choice == 'N') {
									for (int i = 0; i < 5; i++) {
										int u = 1 + i;
										System.out.println("\nFill in Monthly Menu for Day " + u);
										MonthlyMenu mMenu = inputMonthlyMenu();
										addMonthlyMenu(monthlyList, mMenu);
									}
									System.out.println("Monthly Menu have been generated!");
								}
							} else {
								System.out.println("Monthly Menu have already been generated!");
							}
						}

						else if (mmoption == 2) {
							// View Monthly Menu
							viewMonthlyMenu(monthlyList);
						}

						else if (mmoption == 3) {
							// Delete Monthly Menu
							deleteMonthlyMenu(monthlyList);
						}
					}

					else if (staffoption == 2) {
						// Menu Items
						C206_CaseStudy.StaffMenu2();
						int moption = Helper.readInt("Enter an option > ");

						if (moption == 1) {
							// Add Menu Items
							C206_CaseStudy.ItemsMenu();
							int addoption1 = Helper.readInt("Enter an option > ");

							if (addoption1 == 1) {
								String drinks = Helper.readString("Add a drink > ");
								addDrinkItem(drinkList, drinks);
							} else if (addoption1 == 2) {
								String food = Helper.readString("Add a food > ");
								String category = Helper.readString("Category > ");
								addFoodItem(itemList, food, category);
							}
						}

						else if (moption == 2) {
							// View Menu Items
							viewMenuItem(itemList, drinkList);
						}

						else if (moption == 3) {
							C206_CaseStudy.DeleteMenu();
							int deleteoption1 = Helper.readInt("Enter an option > ");

							if (deleteoption1 == 1) {
								deleteDrinkItem(drinkList);
							} else if (deleteoption1 == 2) {
								deleteFoodItem(itemList);
							}
						}

					} else if (staffoption == 3) {
						// Order Bill
						C206_CaseStudy.StaffMenu3();
						int oboption = Helper.readInt("Enter an option > ");

						if (oboption == 1) {
							// Add Order Bill
						}

						else if (oboption == 2) {
							// View Order Bill
						}

						else if (oboption == 3) {
							// Delete Order Bill
						}
					}

					else if (staffoption == 4) {
						C206_CaseStudy.MainMenu();
						option = Helper.readInt("Enter an option > ");
					}

				} else if (option == 2) {
					// User Login
					C206_CaseStudy.UserMenu();
					int useroption = Helper.readInt("Enter an option > ");

					if (useroption == 1) {
						// User Account
						C206_CaseStudy.UserMenu1();
						int accoption = Helper.readInt("Enter an option > ");

						if (accoption == 1) {
							// Add User Account
							Account acc = addInputAccount();
							C206_CaseStudy.addAccount(accountList, acc);

						}

						else if (accoption == 2) {
							// View User Account
							C206_CaseStudy.viewAccount(accountList);
						}

						else if (accoption == 3) {
							// Delete User Account
							C206_CaseStudy.delectAccount(accountList);
						} else if (accoption == 4) {
							// update User Account
							C206_CaseStudy.updateAccount(accountList);
						}
					} else if (useroption == 2) {
						// LunchBox Order
						C206_CaseStudy.UserMenu2();
						int loOption = Helper.readInt("Enter an option > ");

						if (loOption == 1) {
							// Place LunchBox Order
							placeOrder(orderList, lunchboxList);
							
						}

						else if (loOption == 2) {
							// View LunchBox Order
							viewOrders(orderList);
						}

						else if (loOption == 3) {
							// Delete LunchBox Order
							deleteOrder(orderList);
						}
					}

					else if (useroption == 3) {
						C206_CaseStudy.MainMenu();
						option = Helper.readInt("Enter an option > ");
					}
				}

				else {
					System.out.println("Goodbye!");
					break;
				}
			}
		}

	}

	public static void MainMenu() {
		C206_CaseStudy.setHeader("Login");
		System.out.println("1. Staff Login");
		System.out.println("2. User Login");
		System.out.println("3. Quit");
		Helper.line(80, "-");
	}

	public static void StaffMenu() {
		C206_CaseStudy.setHeader("Staff");
		System.out.println("1. Monthly Menu");
		System.out.println("2. Menu Items");
		System.out.println("3. Order Bills");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void StaffMenu1() {
		C206_CaseStudy.setHeader("Monthly Menu");
		System.out.println("1. Create Monthly Menu");
		System.out.println("2. View Monthly Menu");
		System.out.println("3. Delete Monthly Menu");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void StaffMenu2() {
		C206_CaseStudy.setHeader("Menu Items");
		System.out.println("1. Add Menu Items");
		System.out.println("2. View Menu Items");
		System.out.println("3. Delete Menu Items");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void StaffMenu3() {
		C206_CaseStudy.setHeader("Order Bills");
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Order Bill");
		System.out.println("3. Delete Order Bill");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void UserMenu() {
		C206_CaseStudy.setHeader("User");
		System.out.println("1. User Account");
		System.out.println("2. LunchBox Order");
		System.out.println("3. Quit");
		Helper.line(80, "-");
	}

	public static void UserMenu1() {
		C206_CaseStudy.setHeader("User Account");
		System.out.println("1. Add User Account");
		System.out.println("2. View User Account");
		System.out.println("3. Delete User Account");
		System.out.println("4. Update User Account");
		System.out.println("5. Quit");
		Helper.line(80, "-");
	}

	public static void UserMenu2() {
		C206_CaseStudy.setHeader("School LunchBox APP");
		System.out.println("1. Place LunchBox Order");
		System.out.println("2. View LunchBox Order");
		System.out.println("3. Delete LunchBox Order");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void ItemsMenu() {
		C206_CaseStudy.setHeader("Item Type");
		System.out.println("1. Add Drinks");
		System.out.println("2. Add Food");
		System.out.println("3. Quit");
		Helper.line(80, "-");
	}
	
	public static void DeleteMenu() {
		C206_CaseStudy.setHeader("Item Type");
		System.out.println("1. Delete Drinks");
		System.out.println("2. Delete Food");
		System.out.println("3. Quit");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String retrieveAllLunchBoxes(ArrayList<LunchBox> lunchboxList) {
		String output = "";
		// write your code here
		for (int i = 0; i < lunchboxList.size(); i++) {

			output += String.format("%-10s %-30s %-10s\n", lunchboxList.get(i).getLunchBoxName(),
					lunchboxList.get(i).getCategory(), lunchboxList.get(i).getPrice());
		}
		return output;
	}

	public static void viewAllLunchBoxes(ArrayList<LunchBox> lunchboxList) {

		C206_CaseStudy.setHeader("LUNCHBOX LIST");
		String output = String.format("%-10s %-30s %-10s\n", "LUNCHBOX", "CATEGORY", "PRICE");
		output += retrieveAllLunchBoxes(lunchboxList);
		System.out.println(output);
	}

	public static MonthlyMenu inputMonthlyMenu() {

		int day = Helper.readInt("Day > ");
		String cat = Helper.readString("Category > ");
		String food = Helper.readString("Food Name > ");
		String drink = Helper.readString("Drink Name > ");
		MonthlyMenu mMenu = new MonthlyMenu(day, cat, food, drink);

		return mMenu;

	}

	public static void addMonthlyMenu(ArrayList<MonthlyMenu> monthlyList, MonthlyMenu mMenu) {
		monthlyList.add(mMenu);
		System.out.println("Added!");
	}

	public static int doRandom(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	public static void generateRandomMonthlyMenu(ArrayList<MonthlyMenu> monthlyList, ArrayList<Drinks> drinkList,
			ArrayList<Items> itemList) {

		for (int i = 0; i < 5; i++) {
			Random random = new Random();
			int min = 0, max = 4;

			int r1 = random.nextInt((max - min) + 1) + min;
			int r2 = random.nextInt((max - min) + 1) + min;

			Items m = itemList.get(r1);
			Drinks d = drinkList.get(r2);
			monthlyList.add(new MonthlyMenu(i + 1, m.getCategory(), m.getItem(), d.getName()));

		}
		System.out.println("Monthly Menu have been generated!");
	}

	public static void deleteMonthlyMenu(ArrayList<MonthlyMenu> monthlyList) {

		if (monthlyList.isEmpty() == false) {
			monthlyList.removeAll(monthlyList);

			System.out.println("Monthly Menu have been deleted. Please generate a new one for the month!");

		} else {
			System.out.println("Monthly Menu is not available. Please generate a Monthly Menu!");
		}

	}

	public static String retrieveMonthlyMenu(ArrayList<MonthlyMenu> monthlyList) {
		String output = "";
		for (int i = 0; i < monthlyList.size(); i++) {
			output += String.format("%-5d %-20s %-20s %-20s\n", monthlyList.get(i).getDay(),
					monthlyList.get(i).getCat(), monthlyList.get(i).getFood(), monthlyList.get(i).getDrink());
		}
		return output;
	}

	public static void viewMonthlyMenu(ArrayList<MonthlyMenu> monthlyList) {

		if (monthlyList.isEmpty() == false) {
			String output = String.format("%-5s %-20s %-20s %-20s\n", "DAY", "CATEGORY", "FOOD", "DRINK");

			output += retrieveMonthlyMenu(monthlyList);
			System.out.println(output);
		}

		else {
			System.out.println("Monthly Menu is not available. Please Generate a new Monthly Menu!");
		}

	}

public static String getOrders(ArrayList<LunchBox>orderList) {
		
		String order = "";
		for(LunchBox Order : orderList)
		order += String.format("%-10s %-30s %-10s\n", Order.getLunchBoxName(), Order.getCategory(), Order.getPrice());
		
		return order; 
	}
	
	public static void viewOrders(ArrayList<LunchBox>orderList) {
		String output = "";
		 output += getOrders(orderList);	
		 System.out.println(output);
	}
	
	public static void placeOrder(ArrayList<LunchBox>orderList, ArrayList<LunchBox>lunchboxList) {
		boolean validOrder = false;
		String newOrder = Helper.readString("Enter in Lunchbox name to order > ");
		for(LunchBox lunchbox : lunchboxList) {
			if(lunchbox.getLunchBoxName().equalsIgnoreCase(newOrder)) {
				
				validOrder = true;
				orderList.add(lunchbox);
			}
		}
		if(validOrder == false) {
			System.out.println("Invalid Order!");
		}

	}
	
	public static void deleteOrder(ArrayList<LunchBox>orderList) {
		boolean validOrder = false;
		String deleteOrder = Helper.readString("Enter in Lunchbox name to delete > ");
		for(LunchBox lunchbox : orderList) {
			if(lunchbox.getLunchBoxName().equalsIgnoreCase(deleteOrder)) {
				
				validOrder = true;
				orderList.remove(lunchbox);
			}
		}
		if(validOrder == false) {
			System.out.println("Invalid Order!");
		}

	}

	
	public static String retrieveAccount(ArrayList<Account> accountList) {
		String output = "";
		for (int i = 0; i < accountList.size(); i++) {
			output += String.format("%-20s %-20s %-20s %-20s\n", accountList.get(i).getRole(),
					accountList.get(i).getUsername(), accountList.get(i).getContactNumber(),
					accountList.get(i).getPassword());
		}
		return output;

	}

	public static void viewAccount(ArrayList<Account> accountList) {
		C206_CaseStudy.setHeader("Account");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "ROLE", "USERNAME", "CONTACT NUMBER", "PASSWORD");
		output += retrieveAccount(accountList);
		System.out.println(output);

	}

	public static Account addInputAccount() {
		String role = Helper.readString("Enter User role > ");
		String username = Helper.readString("Enter Username > ");
		int contactNumber = Helper.readInt("Enter User Contact Number > ");
		String pw = Helper.readString("Enter User Password > ");

		Account acc = new Account(role, username, pw, contactNumber);
		return acc;

	}

	public static void addAccount(ArrayList<Account> accountList, Account acc) {
		accountList.add(acc);
		System.out.println("User added!");
	}

	public static boolean doDeleteAccount(ArrayList<Account> accountList, String username) {
		boolean flag = false;

		for (int i = 0; i < accountList.size(); i++) {
			String getUName = accountList.get(i).getUsername();

			if (username.equals(getUName)) {
				flag = true;
			}
		}
		return flag;
	}

	public static void delectAccount(ArrayList<Account> accountList) {

		String username = Helper.readString("Enter Username: ");

		boolean flag = doDeleteAccount(accountList, username);

		if (flag == true) {
			for (int i = 0; i < accountList.size(); i++) {
				if (username.equals(accountList.get(i).getUsername())) {
					accountList.remove(i);
				}
			}
			System.out.println("User account has been deleted!");
		}
	}
	
	public static boolean doDeleteDrink(ArrayList<Drinks> drinkList, String drinks) {
		boolean check = false;

		for (int i = 0; i < drinkList.size(); i++) {
			Drinks d = drinkList.get(i);
			if (drinks.equals(d.getName())) {
				check = true;
				break;
			}
		}

		return check;
	}

	public static boolean doDeleteFood(ArrayList<Items> itemList, String item) {
		boolean check = false;

		for (int i = 0; i < itemList.size(); i++) {
			Items a = itemList.get(i);
			if (item.equals(a.getItem())) {
				check = true;
				break;
			}
		}

		return check;
	}

	public static void addDrinkItem(ArrayList<Drinks> drinkList, String drinks) {
		drinkList.add(new Drinks(drinks));
		System.out.println("Drinks added successfully");
	}

	public static void addFoodItem(ArrayList<Items> itemList, String food, String category) {
		itemList.add(new Items(food, category));
		System.out.println("Food added successfully");
	}

	public static void deleteDrinkItem(ArrayList<Drinks> drinkList) {
		String item = Helper.readString("Enter drink name to delete > ");

		boolean check = doDeleteDrink(drinkList, item);

		if (check == true) {
			for (int i = 0; i < drinkList.size(); i++) {
				Drinks d = drinkList.get(i);
				if (item.equals(d.getName())) {
					drinkList.remove(i);
					break;
				}
			}
		}
		System.out.println("Drink has been deleted.");
	}

	public static void deleteFoodItem(ArrayList<Items> itemList) {
		String item = Helper.readString("Enter food name to delete > ");

		boolean check = doDeleteFood(itemList, item);

		if (check == true) {
			for (int i = 0; i < itemList.size(); i++) {
				Items a = itemList.get(i);
				if (item.equals(a.getItem())) {
					itemList.remove(i);
					break;
				}
			}
		}
		System.out.println("Food has been deleted.");
	}

	public static void viewMenuItem(ArrayList<Items> itemList, ArrayList<Drinks> drinkList) {
		int a = 0;
		int b = 0;

		System.out.println("Food Item: ");
		for (Items i : itemList) {
			a++;
			System.out.println(a + ". " + i.getItem());
		}

		System.out.println("\nDrink Item: ");
		for (Drinks d : drinkList) {
			b++;
			System.out.println(b + ". " + d.getName());
		}
	}

	public static boolean modifyAccount(ArrayList<Account> accountList, String username) {
		boolean flag = false;

		for (int i = 0; i < accountList.size(); i++) {
			String name = accountList.get(i).getUsername();
			if (username.equals(name)) {
				flag = true;
			}
		}
		return flag;
	}

	public static void updateAccount(ArrayList<Account> accountList) {
		viewAccount(accountList);

		String username = Helper.readString("Enter username to update > ");
		boolean flag = modifyAccount(accountList, username);
		if (flag == false) {
			System.out.println("Username invalid");
		} else {
			for (int i = 0; i < accountList.size(); i++) {
				if (accountList.get(i).getUsername().equals(username)) {
					String newUsername = Helper.readString("Enter new username > ");
					int newcontactNumber = Helper.readInt("Enter new contact number > ");
					String newPW = Helper.readString("Enter new password > ");

					accountList.get(i).setUsername(newUsername);
					accountList.get(i).setContactNumber(newcontactNumber);
					accountList.get(i).setPassword(newPW);

				}
			}
		}
		System.out.println("Account has been updated!");

	}
	public static String retrieveOrderbill(ArrayList<OrderBills> orderbillList) {
		String output = "";
		for(int i = 0; i<orderbillList.size();i++) {
			output += String.format("%-15d %-10s%-20d", orderbillList.get(i).getAmount(), orderbillList.get(i).getItems(), orderbillList.get(i).getBillNo());
		}
		return output;
		
	}
	public static void viewOrderbill(ArrayList<OrderBills> orderbillList) {
		C206_CaseStudy.setHeader("Order Bills");
		String output = String.format("%-15s %-10s%-20s", "AMOUNT", "ITEMS", "BILL NUMBER");
		output += retrieveOrderbill(orderbillList);
		System.out.println(output);
	}
	
	public static void Orderbilladd(ArrayList<OrderBills> orderbillList) {
		int total = Helper.readInt("Enter total bill amount: ");
		String item = Helper.readString("Enter Item: ");
		int billNum = Helper.readInt("Enter Bill Number: ");
		
		orderbillList.add(new OrderBills(total,item,billNum));

	}
	
	public static void addOrderbill(ArrayList<OrderBills> orderbillList, OrderBills ob) {
		orderbillList.add(ob);
		System.out.print("Order bill added");
	}

	public static void Orderbilldelete(ArrayList<OrderBills> orderbillList) {
		int option = Helper.readInt("Enter Bill Number to delete >");
		
		for(int i = 0; i<orderbillList.size();i++) {
			if(orderbillList.get(i).getBillNo() == option) {
				deleteOrderbill(orderbillList, i);
			}
		}
		
	}
	public static void deleteOrderbill(ArrayList<OrderBills> orderbillList, int i) {
		orderbillList.remove(i);
		
	}
	public static void updateOrderbill(ArrayList<OrderBills> orderbillList) {
		int option = Helper.readInt("Enter Bill Number to delete >");
		
		for(int i = 0; i<orderbillList.size();i++) {
			if(orderbillList.get(i).getBillNo() == option) {
				int choose = Helper.readInt("Which Field do you want to edit:");
					if(choose == 1) {
						int newtotal = Helper.readInt("Enter new total: ");
						orderbillList.get(i).setAmount(newtotal);
					}else if(choose == 2) {
						String newitem = Helper.readString("Enter new Item: ");
						orderbillList.get(i).setItems(newitem);
					}else if(choose == 3) {
						int newNum = Helper.readInt("Enter new Bill Number: ");
						orderbillList.get(i).setBillNo(newNum);
					}
			}else {
				System.out.print("No such Bill Number");
			}
		}
	}

}
