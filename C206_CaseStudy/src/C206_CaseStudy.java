import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
		ArrayList<LunchBox> lunchboxList = new ArrayList<LunchBox>();

		ArrayList<UserAccount> userAcctList = new ArrayList<UserAccount>();

		// add user account
		userAcctList.add(new UserAccount(1, "Matthew", "T0313194c", "Student"));

		// add lunchbox to arraylist
		lunchboxList.add(new LunchBox("Tuna Sandwich", "Vegetarian Food", 2.50));
		lunchboxList.add(new LunchBox("Chicken Cutlet Rice", "Western Food", 5.00));
		lunchboxList.add(new LunchBox("Char Kuay Teow", "Asian Food", 4.00));

		int option = 0;

		while (option != 3) {

			LunchBoxMain.MainMenu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View Staff Menu
				LunchBoxMain.StaffMenu();
				option = Helper.readInt("Enter an option > ");

				if (option == 1) {
					// Monthly Menu
					LunchBoxMain.StaffMenu1();
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
					LunchBoxMain.StaffMenu2();
					option = Helper.readInt("Enter an option > ");

					if (option == 1) {
						// Add Menu Items
					}

					else if (option == 2) {
						// View Menu Items
					}

					else if (option == 3) {
						// Delete Menu Items
					}
				}

				else if (option == 3) {
					// Order Bill
					LunchBoxMain.StaffMenu3();
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
				LunchBoxMain.UserMenu();
				option = Helper.readInt("Enter an option > ");
				
				if (option == 1) {
					//User Account
					LunchBoxMain.UserMenu1();
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
				}
				else if (option == 2) {
					//LunchBox Order
					LunchBoxMain.UserMenu2();
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
}
