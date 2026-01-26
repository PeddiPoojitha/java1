package _11_12_25;

public class harshadNumber {
	public boolean getharshadNumber(int num) {
		int sum=0;
		int temp=num;
		while(temp>0) {
			sum+=temp%10;
			temp/=10;
		}
		return num%sum==0;
	}
	public static void main(String[] args) {
		harshadNumber obj=new harshadNumber();
		System.out.println(obj.getharshadNumber(23)?"harshadNumber":"!harshadNumber");
		System.out.println(obj.getharshadNumber(18)?"harshadNumber":"!harshadNumber");
		

	}

}
