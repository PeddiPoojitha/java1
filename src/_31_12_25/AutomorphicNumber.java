package _31_12_25;
import java.util.Scanner;

public class AutomorphicNumber {
	public boolean isAutomorphic(int num) {
		int sqrt=num*num;
		int digit=num;
		while(digit<0) {
			if(digit%10!=sqrt%10) {
				return false;
			}
			digit=digit/10;
			sqrt=sqrt/10;
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		AutomorphicNumber obj=new AutomorphicNumber();
		boolean result=obj.isAutomorphic(num);
		if(result) {
			System.out.println("Automorphicnumber");
		}
		else {
			System.out.println("!Automorphicnumber");
			sc.close();
		}
		
		

	}

}
