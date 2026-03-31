package _11_12_25;

public class Prime {
	public boolean getPrime(int num) {
		for(int i=2;i<=(int)Math.sqrt(i);i++) {
			if(num%i==0) {
				return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		Prime obj=new Prime();
		System.out.println(obj.getPrime(49)?"Prime":"Not Prime");

	}

}
