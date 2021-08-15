import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Account parent1;
	private Account parent2;
	private Account parent3;
	private ArrayList<Account> accountList;
	

	
	private MonthlyMenu mMenu1;
	private MonthlyMenu mMenu2;
	private MonthlyMenu mMenu3;
	private MonthlyMenu mMenu4;
	private MonthlyMenu mMenu5;
	private ArrayList<MonthlyMenu> monthlyList;

	@Before
	public void setUp() throws Exception {

		parent1 = new Account("Parent", "parent1", "parentPW1", 11110001);
		parent2 = new Account("Parent", "parent2", "parentPW2", 11110002);
		parent3 = new Account("Parent", "parent3", "parentPW3", 11110003);
		accountList = new ArrayList<Account>();
		
		mMenu1 = new MonthlyMenu(1, "Asian", "Laksa", "Iced Tea");
		mMenu2 = new MonthlyMenu(2, "Asian", "Wanton Noodle", "Iced Coffee");
		mMenu3 = new MonthlyMenu(2, "Western", "Baked Pasta", "Bandung");
		mMenu4 = new MonthlyMenu(1, "Western", "Pizza", "Iced Milo");
		mMenu5 = new MonthlyMenu(1, "Western", "Spaghetti", "Iced Latte");
		monthlyList = new ArrayList<MonthlyMenu>();
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test
	public void testViewAccount() {
		// Navin's testViewAccount
		// Account list is not null, so that can add a new Account
		assertNotNull("Test if there is valid account arraylist to add to", accountList);

		// test if the list of Account retrieved from the SourceCentre is empty
		String allAccount = C206_CaseStudy.retrieveAccount(accountList);
		String testOutput = "";

		assertEquals("Check that viewAccount", testOutput, allAccount);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addAccount(accountList, parent1);
		assertEquals("Check of account list size is 1", accountList.size(), 1);

		// The Account just added is as same as the first item of the list
		assertSame("Test that Account is added same as 1st item of the list?", parent1, accountList.get(0));

		// Add another Account, test the size of the list is 2?
		C206_CaseStudy.addAccount(accountList, parent2);
		assertEquals("Check of account list size is 2", accountList.size(), 2);

		// The Account just added is as same as the second item of the list
		assertSame("Test that Account is added same as 2nd item of the list?", parent2, accountList.get(1));

		// test if the expected output string same as the list of accounts retrieved
		// from the SourceCentre
		allAccount = C206_CaseStudy.retrieveAccount(accountList);

		testOutput = String.format("%-20s %-20s %-20s %-20s\n", "Parent", "parent1", 11110001, "parentPW1");

		testOutput += String.format("%-20s %-20s %-20s %-20s\n", "Parent", "parent2", 11110002, "parentPW2");

		assertEquals("Check that viewAccount", testOutput, allAccount);

		// Add another Account, test the size of the list is 3?
		C206_CaseStudy.addAccount(accountList, parent3);
		assertEquals("Check of account list size is 3", accountList.size(), 3);

		// The Account just added is as same as the third item of the list
		assertSame("Test that Account is added same as 3rd item of the list?", parent3, accountList.get(2));
	}

	@Test
	public void testAddAccount() {
		// Navin's testAddAccount
		// Account list is not null, so that can add a new item
		assertNotNull("Test if there is valid Account arraylist to add to", accountList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addAccount(accountList, parent1);
		assertEquals("Check of account list size is 1", accountList.size(), 1);

		// The Account just added is as same as the first item of the list
		assertSame("Test that Account is added same as 1st item of the list?", parent1, accountList.get(0));

		// Add another Account, test the size of the list is 2?
		C206_CaseStudy.addAccount(accountList, parent2);
		assertEquals("Check of account list size is 2", accountList.size(), 2);

		// The Account just added is as same as the second item of the list
		assertSame("Test that Account is added same as 2nd item of the list?", parent2, accountList.get(1));

		// Add another Account, test the size of the list is 3?
		C206_CaseStudy.addAccount(accountList, parent3);
		assertEquals("Check of account list size is 3", accountList.size(), 3);

		// The Account just added is as same as the third item of the list
		assertSame("Test that Account is added same as 3rd item of the list?", parent3, accountList.get(2));
	}

	@Test
	public void testDeleteAccount() {
		// Navin's testDeleteAccount
		// Account list is not null, so that can add a new item
		assertNotNull("Test if there is valid Account arraylist to add to", accountList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addAccount(accountList, parent1);
		assertEquals("Check of account list size is 1", accountList.size(), 1);

		// deletes object that corresponds to the username from the ArrayList
		boolean flag = C206_CaseStudy.doDeleteAccount(accountList, "parent1");
		assertTrue("Test to see if parent 1 can be deleted", flag);

		// Given an empty list, after adding 1 item, the size of the list is 2
		C206_CaseStudy.addAccount(accountList, parent2);
		assertEquals("Check of account list size is 2", accountList.size(), 2);

		// deletes object that corresponds to the username from the ArrayList
		flag = C206_CaseStudy.doDeleteAccount(accountList, "parent2");
		assertTrue("Test to see if parent 2 can be deleted", flag);

		// Given an empty list, after adding 1 item, the size of the list is 3
		C206_CaseStudy.addAccount(accountList, parent3);
		assertEquals("Check of account list size is 3", accountList.size(), 3);

		// deletes object that corresponds to the username from the ArrayList
		flag = C206_CaseStudy.doDeleteAccount(accountList, "parent3");
		assertTrue("Test to see if parent 3 can be deleted", flag);

		// error condition
		flag = C206_CaseStudy.doDeleteAccount(accountList, "error");
		assertFalse("Test to see if a non-existing account can be deleted", flag);

	}
	
	@Test
	public void testAddMonthlyMenu() {
		// Balqis' testGenerateMonthlyMenu
		// Monthly Menu list is not null, so that can generate a new Monthly Menu
		assertNotNull("Test if there is valid monthly menu arraylist to add to", monthlyList);
		
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu1);
		assertEquals("Check of account list size is 1", accountList.size(), 1);

		// The newly Monthly Menu added is as same as the first item of the list
		assertSame("Test that Monthly Menu added is same as 1st item of the list?", mMenu1, monthlyList.get(0));

		// Add another Monthly Menu, test the size of the list is 2?
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu2);
		assertEquals("Check of account list size is 2", accountList.size(), 2);

		// The newly Monthly Menu added is as same as the second item of the list
		assertSame("Test that Monthly Menu added is same as 2nd item of the list?", mMenu2, monthlyList.get(1));
		
		// Add another Monthly Menu, test the size of the list is 3?
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu3);
		assertEquals("Check of account list size is 3", accountList.size(), 3);

		// The newly Monthly Menu added is as same as the third item of the list
		assertSame("Test that Monthly Menu added is same as 3rd item of the list?", mMenu3, monthlyList.get(2));
		
		// Add another Monthly Menu, test the size of the list is 4?
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu4);
		assertEquals("Check of account list size is 4", accountList.size(), 4);

		// The newly Monthly Menu added is as same as the second item of the list
		assertSame("Test that Monthly Menu added is same as 4th item of the list?", mMenu4, monthlyList.get(3));
		
		// Add another Monthly Menu, test the size of the list is 5?
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu5);
		assertEquals("Check of account list size is 5", accountList.size(), 5);

		// The newly Monthly Menu added is as same as the second item of the list
		assertSame("Test that Monthly Menu added is same as 5th item of the list?", mMenu5, monthlyList.get(4));
		
		// Given a list, the list size in the end is 5
		C206_CaseStudy.retrieveMonthlyMenu(monthlyList);
		assertEquals("Check of account list size is 5", monthlyList.size(), 5);
		
	}


	@Test
	public void testDeleteMonthlyMenu() {
		// Balqis' testDeleteMonthlyMenu
		// Monthly Menu list is not null, so that can add a new item
		assertNotNull("Test if there is valid monthly menu arraylist to add to", monthlyList);
		
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu1);
		assertEquals("Check of account list size is 1", accountList.size(), 1);

		// The newly Monthly Menu added is as same as the first item of the list
		assertSame("Test that Monthly Menu added is same as 1st item of the list?", mMenu1, monthlyList.get(0));
		
		// Add another Monthly Menu, test the size of the list is 2?
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu2);
		assertEquals("Check of account list size is 2", accountList.size(), 2);

		// The newly Monthly Menu added is as same as the second item of the list
		assertSame("Test that Monthly Menu added is same as 2nd item of the list?", mMenu2, monthlyList.get(1));
		
		// deletes entire object from the ArrayList
		C206_CaseStudy.deleteMonthlyMenu(monthlyList);
		assertEquals("Test to see if list is deleted", monthlyList.size(), 0);

		// error condition where monthlyList is empty
		C206_CaseStudy.deleteMonthlyMenu(monthlyList);
		assertEquals("Test to see if empty list can be deleted", monthlyList.size(), 0);

	}
	
	@Test
	public void testViewMonthlyMenu() {
		// Balqis' testViewMonthlyMenu
		// Monthly Menu list is not null, so that can add a new item
		assertNotNull("Test if there is valid monthly menu arraylist to add to", monthlyList);
		
		// test if the list of Monthly Menu retrieved from the main class is empty
		String monthlyMenu = C206_CaseStudy.retrieveMonthlyMenu(monthlyList);
		String testOutput = "";

		assertEquals("Check that viewMonthlyMenu", testOutput, monthlyMenu);
				
		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu1);
		assertEquals("Check of account list size is 1", accountList.size(), 1);

		// The newly Monthly Menu added is as same as the first item of the list
		assertSame("Test that Monthly Menu added is same as 1st item of the list?", mMenu1, monthlyList.get(0));
				
		// Add another Monthly Menu, test the size of the list is 2?
		C206_CaseStudy.addMonthlyMenu(monthlyList, mMenu2);
		assertEquals("Check of account list size is 2", accountList.size(), 2);

		// The newly Monthly Menu added is as same as the second item of the list
		assertSame("Test that Monthly Menu added is same as 2nd item of the list?", mMenu2, monthlyList.get(1));
		

		// test if the expected output is same as the list of monthly menu retrieved from the main class
		monthlyMenu = C206_CaseStudy.retrieveMonthlyMenu(monthlyList);

		testOutput = String.format("%-5d %-20s %-20s %-20s\n", 1, "Asian", "Laksa", "Iced Tea");
		testOutput+= String.format("%-5d %-20s %-20s %-20s\n", 2, "Asian", "Wanton Noodle", "Iced Coffee");

		assertEquals("Check that viewMonthlyMenu", testOutput, monthlyMenu);
		
	}

	@After
	public void tearDown() throws Exception {
		parent1 = null;
		parent2 = null;
		parent3 = null;
		accountList = null;
		
		mMenu1 = null;
		mMenu2 = null;
		mMenu3 = null;
		mMenu4 = null;
		mMenu5 = null;
		monthlyList = null;

	}
	
	

}
