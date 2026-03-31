package loops_concept;

public class Automorphic {
	public boolean isAutomorphic(int num) {
		int sqrt=num*num;
		
		return String.valueOf(sqrt).endsWith(String.valueOf(num));
	}
		

	public static void main(String[] args) {
		Automorphic obj=new	Automorphic();
		if(obj.isAutomorphic(25)) {
			System.out.println("Automorphic Number");
			
		}
		else {
			 System.out.println("not Automorphic Number");
		}
		
	}
	

}
