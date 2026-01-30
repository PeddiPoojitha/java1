package Variables;

public class App {
	String appName="kgf";
	int usagecount=0;
	public void openApp(String appName,int usagecount ) {
		usagecount++;
	}
	public void display() {
		System.out.println("Appname:"+appName);
		System.out.println("Appcount:"+usagecount);
	}
	
	public static void main(String[] args) {
		App a=new App();
		a.display();
	
		
	}

}
