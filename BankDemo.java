package assignment3;

class SavingsAccount {
	double balance;
	double interest;

	public SavingsAccount(double balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}

	void withdraw(int amount) {
		balance = balance - amount;
	}

	void deposite(int amount) {
		balance = balance + amount;
	}

	/*
	 * void addInterest(int amount) { double intr=balance*(interest/100);
	 * balance=balance+intr; }
	 */

	public double getbalance() {
		double intr = balance * (interest / 100);
		balance = balance + intr;
		return balance;
	}
}

public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount(2000.00, 4.0);
		System.out.println(s1.getbalance());
		s1.deposite(500);
		System.out.println(s1.getbalance());
		s1.withdraw(200);
		System.out.println(s1.getbalance());
	}

}
