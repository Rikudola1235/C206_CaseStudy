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
					//User Account
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
				}
				else if (option == 2) {
					//LunchBox Order
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
	
	private static void MainMenu() {
		LunchBoxMain.setHeader("Login");
		System.out.println("1. Staff Login");
		System.out.println("2. User Login");
		System.out.println("3. Quit");
		Helper.line(80, "-");
	}

	private static void StaffMenu() {
		LunchBoxMain.setHeader("Staff");
		System.out.println("1. Monthly Menu");
		System.out.println("2. Menu Items");
		System.out.println("3. Order Bills");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void StaffMenu1() {
		LunchBoxMain.setHeader("Monthly Menu");
		System.out.println("1. Create Monthly Menu");
		System.out.println("2. View Monthly Menu");
		System.out.println("3. Delete Monthly Menu");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void StaffMenu2() {
		LunchBoxMain.setHeader("Menu Items");
		System.out.println("1. Add Menu Items");
		System.out.println("2. View Menu Items");
		System.out.println("3. Delete Menu Items");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void StaffMenu3() {
		LunchBoxMain.setHeader("Order Bills");
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Order Bill");
		System.out.println("3. Delete Order Bill");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void UserMenu() {
		// TODO Auto-generated method stub
		LunchBoxMain.setHeader("User");
		System.out.println("1. User Account");
		System.out.println("2. LunchBox Order");
		System.out.println("3. Quit");
		Helper.line(80, "-");
	}

	private static void UserMenu1() {
		LunchBoxMain.setHeader("User Account");
		System.out.println("1. Add User Account");
		System.out.println("2. View User Account");
		System.out.println("3. Delete User Account");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	private static void UserMenu2() {
		LunchBoxMain.setHeader("School LunchBox APP");
		System.out.println("1. Place LunchBox Order");
		System.out.println("2. View LunchBox Order");
		System.out.println("3. Delete LunchBox Order");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
}
