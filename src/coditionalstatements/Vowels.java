package coditionalstatements;

public class Vowels {
	public String isVowels(String s) {
		s.toLowerCase();
		char c=s.charAt(0);
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u') {
			return "vowels";
			
		}
		else {
			return "consonat";
		}
	}

	public static void main(String[] args) {
		Vowels obj=new Vowels();
		System.out.println(obj.isVowels("a"));
		System.out.println(obj.isVowels("z"));
		
	}

}
