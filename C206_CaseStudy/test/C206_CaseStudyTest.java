import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Account parent1;
	private Account parent2;
	private Account parent3;

	private ArrayList<Account> accountList;

	@Before
	public void setUp() throws Exception {

		parent1 = new Account("Parent", "parent1", "parentPW1", 11110001);
		parent2 = new Account("Parent", "parent2", "parentPW2", 11110002);
		parent3 = new Account("Parent", "parent3", "parentPW3", 11110003);

		accountList = new ArrayList<Account>();
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

	@After
	public void tearDown() throws Exception {
		parent1 = null;
		parent2 = null;
		parent3 = null;
		accountList = null;
	}

}
