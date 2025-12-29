package inheritance;
class Employee{
	double salary=50000;
}
class Manager extends Employee {
	double bonus=20000;
}

public class Parent {

	public static void main(String[] args) {
		Manager m=new Manager();
		double totalsalary=m.salary+m.bonus;
		System.out.println("totalsal:"+totalsalary);

	}

}
