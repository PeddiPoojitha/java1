package inheritance;
class Animalinheritance{
	public void display() {
		System.out.println("This is an animal");
	}
	
}
class Dog extends Animalinheritance{
	
}

public class Animal {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();

	}

}
