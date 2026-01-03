package com.college.app;
import com.college.model.Student;
import com.college.model.Course;
import com.college.service.StudentService;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the std name");
		String name=sc.nextLine();
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the contactNumber");
		long contactNumber=sc.nextLong();
		System.out.println("enter the std Id");
		int studentId=sc.nextInt();
		System.out.println("enter the dept");
		sc.nextLine();
		String department=sc.nextLine();
		System.out.println("enter the course name");
		String courseName=sc.nextLine();
		System.out.println("enter the course fee");
		double fee=sc.nextDouble();
		Student s=new Student(studentId,department,courseName);
            s.setName(name);
            s.setAge(age);
            s.setContactNumber(contactNumber);
            StudentService obj=new StudentService();
            obj.calculateDiscountedFee(fee,department);
            System.out.println("-------student details----------");
            System.out.println("original fee:"+fee);
            System.out.println("DiscountApplied:"+(department.equals("IT")?"0.10":"None"));
            System.out.println("Final Payable fee:"+fee);
            sc.close();
          }
	

}
