package inheritance;
class Person{
	public Person() {
		System.out.println("Person object created" );
	}
}
class Student extends Person{
	Student(){
		System.out.println("Student object created" );
	}
}


public class Personinheritance {

	public static void main(String[] args) {
		Student std=new Student();
	}

}
