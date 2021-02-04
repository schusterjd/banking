//Jaden Schuster

package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import main.Banking;

public class testDeposit {

	Banking bankAccount = new Banking();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDepositAmount() {
		
		assertNotNull(bankAccount);
		
		bankAccount.deposit(500);
		assertEquals(500, bankAccount.getAmount(), 0.0);
		
		bankAccount.deposit(250);
		assertEquals(750, bankAccount.getAmount(), 0.0);
		
		bankAccount.deposit(2.5);
		assertEquals(752.5, bankAccount.getAmount(), 0.0);
		
	}

}
