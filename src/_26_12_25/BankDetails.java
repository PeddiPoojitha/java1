package _26_12_25;
import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("enter your address:");
		String Address=sc.next();
		System.out.println("enter your phone number:");
		long phone=sc.nextLong();
		System.out.println("enter your balance:");
		double amount=sc.nextDouble();
		BankApplication bank=new BankApplication(name,Address,phone,amount);

		System.out.println("*Select Options from below*\r\n" + "\r\n" + "1. withdraw\r\n" + "\r\n" + "2. deposit\r\n"
				+ "\r\n" + "3. showBalance\r\n" + "\r\n" + "4. exit\r\n" + "\r\n" + "Enter your option [1-4]:");
		boolean status=true;
		while(true) {
			int options=sc.nextInt();
			switch(options) {
			case 1:{
				System.out.println("enter the withdraw amount");
				double Amount=sc.nextDouble();
				bank.withdraw(amount);
				System.out.println("withdraw sucessfully");
				break;	
			}
			case 2: {
				System.out.println("enter the deposit amount");
				double Amount=sc.nextDouble();
				bank.deposit(amount);
				System.out.println("deposit successfully");	
				break;
			}
			case 3:{
				bank.showBalance();
				break;
			}
			case 4:{
				System.out.println("Thank you");
				status=false;
				break;
			}
			default:{
				System.out.println("invalid options");
			}
			}
			
		}
	
		
	}	
	
}


