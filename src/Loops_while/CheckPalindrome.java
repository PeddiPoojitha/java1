package Loops_while;

public class CheckPalindrome {

	public static void main(String[] args) {
		int num=151;
		//int num=1234;
		int rev=0;
		int temp=rev;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("is not palidrome");
		}
		System.out.println("is palidrome");
		
	
	}
}

	

