import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<LunchBox> lunchboxList = new ArrayList<LunchBox>();

		ArrayList<UserAccount> userAcctList = new ArrayList<UserAccount>();

		
		ArrayList<MonthlyMenu> monthlyList = new ArrayList<MonthlyMenu>();
		
		ArrayList<Drinks> drinkList = new ArrayList<Drinks>();
		
		ArrayList <Items> itemList = new ArrayList<Items>();
		

		// add user account
		userAcctList.add(new UserAccount(1, "Matthew", "T0313194c", "Student"));

		// add lunchbox to arraylist
		lunchboxList.add(new LunchBox("Tuna Sandwich", "Vegetarian Food", 2.50));
		lunchboxList.add(new LunchBox("Chicken Cutlet Rice", "Western Food", 5.00));
		lunchboxList.add(new LunchBox("Char Kuay Teow", "Asian Food", 4.00));

		int option = 0;

		while (option != 3) {

			C206_CaseStudy.MainMenu();
			option = Helper.readInt("Enter an option > ");

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
					}

					else if (option == 2) {
						// View Monthly Menu
					}

					else if (option == 3) {
						// Delete Monthly Menu
					}
				}

				else if (option == 2) {
                    // Menu Items
                    C206_CaseStudy.StaffMenu2();
                    option = Helper.readInt("Enter an option > ");
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

                    if (option == 1) {
                        // Add Menu Items
                        C206_CaseStudy.ItemsMenu();


                        if (option == 1) {
                            String drinks = Helper.readString("Add a drink > ");
                            drinkList.add(new Drinks(drinks));
                        } else if (option == 2) {
                            String food = Helper.readString("Add a food > ");
                            String category = Helper.readString("Category > ");
                            itemList.add(new Items(food, category));
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
        
				}


				else if (option == 3) {
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
					}

					else if (option == 2) {
						// View User Account
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
				}
			}

		}
		System.out.println("Goodbye!");
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
	
	public static void generateMonthlyMenu() {
		
	}
	
	public static void deleteMonthlyMenu() {
		
	}
	
	public static void viewMonthlyMenu() {
		generateMonthlyMenu();
		
		String month = Helper.readString("Select Month (1-12) > ");
		String output = String.format("%-5s %-20s %-20s %-20s\n", "DAY", "CATEGORY", "FOOD", "DRINK");
		
	}
	
	
}
