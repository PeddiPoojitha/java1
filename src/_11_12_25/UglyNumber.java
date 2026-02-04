package _11_12_25;

public class UglyNumber {
	public boolean getUgly(int num) {
		if(num<=0) {
			return false;
		}
	//	int[] fact= {2,3,5};
	//	int i=0;
	//	while(i<3) {
		//	if(num%fact[i]==0) {
		//		num/=fact[i];				
			//}
		//	else {
			//	i++;
		//	}
		//}
	//	return num==i;
		while(num%2==0) {  
			num/=2;
		}
		while(num%3==0) {
			num/=3;
		}
		while(num%5==0) {
			num/=5;
		}
		return num==1;
		
	}

	public static void main(String[] args) {
		UglyNumber obj=new UglyNumber();
		System.out.println(obj.getUgly(49)?"Ugly number":"!Ugly number");
		System.out.println(obj.getUgly(8)?"Ugly number":"!Ugly number");
	}

}
