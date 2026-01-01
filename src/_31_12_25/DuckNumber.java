package _31_12_25;
import java.util.Scanner;

public class DuckNumber {
	public boolean isDuck(int n) {
		int digit=n;
		while(digit>0) {
			if(digit%10==0) {
				return true;	
			}
			digit=digit/10;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		DuckNumber obj=new DuckNumber();
		boolean result =obj.isDuck(n);
		if(result) {
			System.out.println("Ducknumber");
		}
		else {
		System.out.println("not ducknumber");
		sc.close();
			
		}

	}

}
