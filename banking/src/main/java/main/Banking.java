//Jaden Schuster

package main;

public class Banking {

	private double amount;
	
	public Banking() {
		
	}

	public Banking(double amount) {
		super();
		this.amount = amount;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount += amount;
	}

	@Override
	public String toString() {
		return "Banking [amount=" + amount + "]";
	}
	
	/**
	 * Deposit amount in bank account.
	 * @param depositAmount amount to be deposited
	 */
	public void deposit(double depositAmount) {
		
		setAmount(depositAmount);
		
	}
	
	/**
	 * Withdraw amount from bank account.
	 * @param withdrawAmount amount to be withdrawn
	 */
	public void withdraw(double withdrawAmount) {
		
		//Check for withdrawAmount greater than funds available
		if (withdrawAmount > getAmount()) {
			
			throw new IllegalArgumentException();
			
		} else {
			
			setAmount(withdrawAmount * -1);
			
		}
		
	}

}
