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

		ArrayList<UserAccount> userAcctList = new ArrayList<UserAccount>();

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
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// Monthly Menu
						C206_CaseStudy.StaffMenu1();
						option = Helper.readInt("Enter an option > ");

						if (option == 1) {
							// Generate Monthly Menu
							generateMonthlyMenu(monthlyList, drinkList, itemList);
						}

						else if (option == 2) {
							// View Monthly Menu
							viewMonthlyMenu(monthlyList);
						}

						else if (option == 3) {
							// Delete Monthly Menu
							deleteMonthlyMenu(monthlyList);
						}
					}

					else if (option == 2) {
						// Menu Items
						C206_CaseStudy.StaffMenu2();
						option = Helper.readInt("Enter an option > ");

						if (option == 1) {
							// Add Menu Items
							C206_CaseStudy.ItemsMenu();
							option = Helper.readInt("Enter an option > ");

							if (option == 1) {
								String drinks = Helper.readString("Add a drink > ");
								drinkList.add(new Drinks(drinks));
								System.out.println("Drinks added successfully");
							} else if (option == 2) {
								String food = Helper.readString("Add a food > ");
								String category = Helper.readString("Category > ");
								itemList.add(new Items(food, category));
								System.out.println("Food added successfully");
							}
						}

						else if (option == 2) {
							int a = 0;
							int b = 0;
							// View Menu Items

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

						else if (option == 3) {
							int a = 0;
							// Delete Menu Items
							C206_CaseStudy.ItemsMenu();
							if (option == 1) {
								String item = Helper.readString("Enter drink name to delete > ");
								for (Drinks d : drinkList) {
									if (item.equals(d.getName())) {
										drinkList.remove(a);
									}
									a++;
								}
							} else if (option == 2) {
								String item = Helper.readString("Enter food name to delete > ");
								for (Items i : itemList) {
									if (item.equals(i.getItem())) {
										itemList.remove(a);
									}
									a++;
								}
							}
						}

					} else if (option == 3) {
						// Order Bill
						C206_CaseStudy.StaffMenu3();
						option = Helper.readInt("Enter an option > ");

						if (option == 1) {
							// Add Order Bill
						}

						else if (option == 2) {
							// View Order Bill
						}

						else if (option == 3) {
							// Delete Order Bill
						}
					}
					C206_CaseStudy.MainMenu();
					option = Helper.readInt("Enter an option > ");
				} else if (option == 2) {
					// User Login
					C206_CaseStudy.UserMenu();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// User Account
						C206_CaseStudy.UserMenu1();
						option = Helper.readInt("Enter an option > ");

						if (option == 1) {
							// Add User Account
							Account acc = addInputAccount();
							C206_CaseStudy.addAccount(accountList, acc);

						}

						else if (option == 2) {
							// View User Account
							C206_CaseStudy.viewAccount(accountList);
						}

						else if (option == 3) {
							// Delete User Account
							C206_CaseStudy.delectAccount(accountList);
						}
					} else if (option == 2) {
						// LunchBox Order
						C206_CaseStudy.UserMenu2();
						option = Helper.readInt("Enter an option > ");

						if (option == 1) {
							// Place LunchBox Order
						}

						else if (option == 2) {
							// View LunchBox Order
						}

						else if (option == 3) {
							// Delete LunchBox Order
						}
					}
					C206_CaseStudy.MainMenu();
					option = Helper.readInt("Enter an option > ");
				} else if (option == 3) {
					// Order Bill
					C206_CaseStudy.StaffMenu3();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// Add Order Bill
					}

					else if (option == 2) {
						// View Order Bill
					}

					else if (option == 3) {
						// Delete Order Bill
					}
				}

			}
			if (option == 2) {
				// User Login
				C206_CaseStudy.UserMenu();
				option = Helper.readInt("Enter an option > ");

				if (option == 1) {
					// User Account

					if (option == 1) {

					}

					else if (option == 2) {
						// view account
						C206_CaseStudy.viewAccount(accountList);
					}

					else if (option == 3) {
						// Delete User Account
					}
				} else if (option == 2) {
					// LunchBox Order
					C206_CaseStudy.UserMenu2();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// Place LunchBox Order
					}

					else if (option == 2) {
						// View LunchBox Order
					}

					else if (option == 3) {
						// Delete LunchBox Order
					}
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
		System.out.println("4. Quit");
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

	public static void generateMonthlyMenu(ArrayList<MonthlyMenu> monthlyList, ArrayList<Drinks> drinkList,
			ArrayList<Items> itemList) {
//		Random random = new Random();
//		int r = random.nextInt(itemList.size());
//		int u = random.nextInt(drinkList.size());
//		
//		
//		for (int i = 1; i < 6; i++) {
//			monthlyList.add(new MonthlyMenu(i, itemList.get(r).getCategory(), itemList.get(r).getItem(), drinkList.get(u).getName()));
//			
//		}

//		for (int i = 0; i < 5; i++)
		for (int i = 0; i < 5; i++) {
			Items m = itemList.get(i);
			Drinks d = drinkList.get(i);
			monthlyList.add(new MonthlyMenu(i + 1, m.getCategory(), m.getItem(), d.getName()));
		}
//		monthlyList.add(new MonthlyMenu(1, itemList.get(0).getCategory(), itemList.get(0).getItem(), drinkList.get(0).getName()));
//		monthlyList.add(new MonthlyMenu(2, itemList.get(1).getCategory(), itemList.get(1).getItem(), drinkList.get(1).getName()));
//		monthlyList.add(new MonthlyMenu(3, itemList.get(2).getCategory(), itemList.get(2).getItem(), drinkList.get(2).getName()));
//		monthlyList.add(new MonthlyMenu(4, itemList.get(3).getCategory(), itemList.get(3).getItem(), drinkList.get(3).getName()));
//		monthlyList.add(new MonthlyMenu(5, itemList.get(4).getCategory(), itemList.get(4).getItem(), drinkList.get(4).getName()));
//		
		System.out.println("Monthly Menu have been generated!");
	}

	public static void deleteMonthlyMenu(ArrayList<MonthlyMenu> monthlyList) {
		int i = 1;
		String dayNo = Helper.readString("Enter day to delete (1-5) > ");

		if (monthlyList.size() >= 1) {
			for (MonthlyMenu m : monthlyList) {
				if (dayNo.equals(m.getDay())) {
					monthlyList.remove(i);
				}
				i++;
			}
		} else if (monthlyList.size() == 0) {
			System.out.println("There is no Monthly Menu in the list. Please generate a Monthly Menu!");
		}

	}

	public static void viewMonthlyMenu(ArrayList<MonthlyMenu> monthlyList) {

		if (monthlyList.size() >= 1) {
			String output = String.format("%-5s %-20s %-20s %-20s\n", "DAY", "CATEGORY", "FOOD", "DRINK");

			for (MonthlyMenu m : monthlyList) {

				output += String.format("%-5d %-20s %-20s %-20s\n", m.getDay(), m.getCat(), m.getFood(), m.getDrink());
			}
			System.out.println(output);
		}

		else if (monthlyList.size() == 0) {
			System.out.println("Monthly Menu is empty. Please Generate a new Monthly Menu!");
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
		
		boolean flag = doDeleteAccount(accountList,username);
		
		if(flag == true) {
			for(int i = 0;i < accountList.size();i++) {
				if(username.equals(accountList.get(i).getUsername())) {
					accountList.remove(i);
				}
			}
			System.out.println("User account has been deleted!");
		}
	}

}
