package coditionalstatements;

public class bigNumber {
	public void LargerNumber(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("largernumber");
		}
		else {
			if(b<c && c>b) {
				System.out.println("smallnumber");
			}
			else {
				System.out.println("equalnumber");
			}
		}
	}

	public static void main(String[] args) {
		bigNumber obj=new bigNumber();
		obj.LargerNumber(20,10,5);
		

	}

}
