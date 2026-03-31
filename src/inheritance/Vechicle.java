package inheritance;
class Main{
	public void run() {
		System.out.println("Vehicle is running");
	}
}
class car extends Main{
	public void speed(){
		System.out.println("car is moving at 80km/hr");	
	}
	
}
public class Vechicle {
	public static void main(String[] args) {
		car c=new car();
		c.run();
		c.speed();
	}
	
}




