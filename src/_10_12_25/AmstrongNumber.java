package _10_12_25;

public class AmstrongNumber {
	public int getPower(int base,int exp) {
		int res=1;
		for(int i=1;i<=exp;i++) {
			res=res*base;	
		}
		return res;
		
	}
	public int getCount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public boolean getAmstrong(int num) {
		int orginal=num;
		int count=getCount(num);
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+getPower(rem,count);
			num=num/10;
		}
		return sum==orginal;
	}

	public static void main(String[] args) {
		AmstrongNumber obj=new AmstrongNumber();
		System.out.println(obj.getAmstrong(153));
		//for(int i=1;i<=100;i++) {
		//	if(obj.getAmstrong(i)) {
			//	System.out.println(i);
		//	}
				
		//}
		
		
	
	}

}
