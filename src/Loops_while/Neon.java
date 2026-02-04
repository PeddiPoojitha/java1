package Loops_while;

public class Neon {
	public boolean getneon(int num) {
		int sqr=num*num;
		int sum=0;
		while(sqr>0) {
			int rem=sqr%10;
			sum=sqr+rem;
			sqr=sqr/10;
		}
		return sum==num;
		
	}

	public static void main(String[] args) {
		Neon obj=new Neon();
		for(int i=1;i<=100;i++) {
			if(obj.getneon(i)) {
				System.out.println(i);
			}
		}
	
   
	}

}
