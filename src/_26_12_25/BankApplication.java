package _26_12_25;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	public BankApplication(String customerName,String customerAddress,long phoneNumber,double balance) {
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
	}
	public void setcustomerName(String customerName) {
		this.customerName=customerName;
		
	}
	public void setcustomerAddress(String customerAddress) {
		this.customerAddress=customerAddress;
		
	}
	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public String getcustomerName() {
		return customerName;
	}
	public String getcustomerAddress() {
		return customerAddress;
	}
	public long getphoneNumber() {
		return phoneNumber;
	}
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposit success");
		}
		else {
			System.out.println("non successfull");
		}
		
	}
	public void withdraw(double amount) {
		if((amount>0)&&(amount<=balance)) {
			balance-=amount;
			System.out.println("withdraw balance");	
		}
		else {
			System.out.println("invalid balance");
		}
		
	}
	public void  showBalance() {
		System.out.println("show avilable balance"+balance);
		
	}
	
}
