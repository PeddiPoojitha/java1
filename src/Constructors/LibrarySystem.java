package Constructors;

public class LibrarySystem {

	public static void main(String[] args) {
		Library obj=new Library(101, "java" ,3);
		System.out.println("initial book details");
		obj.displayDetails();
		for(int i=1;i<=4;i++) {
			System.out.println("borrowed books"+i);
			obj.borrowBook();
			obj.displayDetails();
		}
		for(int i=1;i<=2;i++) {
			System.out.println("return attemp"+i);
			obj.returnBook();
		}
		
	}

}
