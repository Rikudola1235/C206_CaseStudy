import java.util.ArrayList;


public class LunchBoxMain {
	
	private static final int OPTION_QUIT = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<LunchBox> lunchboxList = new ArrayList<LunchBox>();
		
		
		ArrayList<UserAccount> userAcctList = new ArrayList<UserAccount>();
		
		//add user account
		userAcctList.add(new UserAccount(1, "Matthew", "T0313194c", "Student"));
		
		//add lunchbox to arraylist
		lunchboxList.add(new LunchBox("Tuna Sandwich", "Vegetarian Food", 2.50));
		lunchboxList.add(new LunchBox("Chicken Cutlet Rice", "Western Food", 5.00));
		lunchboxList.add(new LunchBox("Char Kuay Teow", "Asian Food", 4.00));
		
		
		int option = 0;
		int userType = 0;
		
		while (option != OPTION_QUIT) {
			
			userType = Helper.readInt("Student(1)/Parent(2) > ");
			
			LunchBoxMain.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				// View all items
				LunchBoxMain.viewAllLunchBoxes(lunchboxList);
				

			} else if (option == 2) {
				// Add a new item
				LunchBoxMain.setHeader("ADD");			
				LunchBoxMain.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
			
				

					LunchBox newlb = inputLunchBox();
					ResourceCentre.addChromebook(lunchboxList, newlb);

				} 

			} else if (option == 3) {
				// Loan item
				ResourceCentre.setHeader("LOAN");			
				ResourceCentre.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorder
					ResourceCentre.loanCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Loan Chromebook
					ResourceCentre.loanChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} 
	}

}

	private static void menu() {
		// TODO Auto-generated method stub
		LunchBoxMain.setHeader("School LunchBox APP");
		System.out.println("1. Display Menu");
		System.out.println("2. Add order");
		System.out.println("3. Delete order");
		System.out.println("4. Quit");
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
		
		LunchBoxMain.setHeader("LUNCHBOX LIST");
		String output = String.format("%-10s %-30s %-10s\n", "LUNCHBOX", "CATEGORY",
				 "PRICE");
		 output += retrieveAllLunchBoxes(lunchboxList);
		System.out.println(output);
	}

}