package _25_11_15_blc_elc;

public class BankAccount {
	long accountNumber;
	String accountholderName;
	double balance;
	public long getaccountNumber() {
		return accountNumber;
	}
	public String getaccountholderName() {
		return accountholderName;
	}
	public double getbalance() {
		return balance;
	}
	public void setaccountNumber(long a) {
		accountNumber=a;
		
	}
	public void setaccountholderName(String n) {
		accountholderName=n;
		
	}
	public void setbalance(double a1) {
		balance=a1;
		
	}
	public String AccountDetails() {
		return "accountnum:"+accountNumber+"\naccountholder:"+"\naccountholderName"+"accbalance:"+balance;	
	}
	

}
