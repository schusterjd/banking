//Jaden Schuster

package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Banking;

public class testWithdraw {
	
	Banking bankAccount = new Banking(500);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithdrawAmount() {
		
		bankAccount.withdraw(250);
		assertEquals(250, bankAccount.getAmount(), 0.0);
		
		bankAccount.withdraw(50);
		assertEquals(200, bankAccount.getAmount(), 0.0);
		
		bankAccount.withdraw(0.5);
		assertTrue(199.5 == bankAccount.getAmount());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionWithdraw() {
		
		bankAccount.withdraw(1000);
		
	}

}
