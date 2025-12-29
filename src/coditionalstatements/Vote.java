package coditionalstatements;

public class Vote {
	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Vote obj=new Vote();
		System.out.println(obj.canVote(20));
		
	}

}
