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
		
		parent1 = new Account("Parent", "parent1", "parentPW1", 20012001, 11110001);
		parent2 = new Account("Parent", "parent2", "parentPW2", 20022001, 11110002);
		parent3 = new Account("Parent", "parent3", "parentPW3", 20032001, 11110003);
		
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testViewAccount() {
		
		assertNotNull("Test if there is valid account arraylist to add to", accountList);
		
		
		
		assertEquals("Check of account list size is 3", accountList.size(),3);
		
	}

}
