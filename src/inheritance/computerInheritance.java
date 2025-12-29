package inheritance;
class Computer{
	public void showBrand() {
		System.out.println("Brand: Dell");
	}
	
}
class Laptop extends Computer{
	public void showModel() {
		System.out.println("Model: XPS 15");
	}
}

public class computerInheritance {

	public static void main(String[] args) {
		Laptop top=new Laptop();
		top.showBrand();
		top.showModel();
		
	}

}
