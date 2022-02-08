package BankAccount;

public class InterestAccount extends BankAccount {
	private double intRate;
	public InterestAccount(String name, int amount, double intRate) {
		super(name, amount);
		this.intRate=intRate;
	}
	public void addInt() {
		deposit((int)(getAmount()*(intRate/100)));
	}
	public String toString() {
		return super.toString()+" The interest rate is "+intRate+"%.";
	}
}
