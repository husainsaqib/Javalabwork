package LabAssignment;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks");
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		int a4=s.nextInt();
		int a5=s.nextInt();
		int avg=(a1+a2+a3+a4+a5)/5;
		Student r=new Student();
		String m=r.grade(avg);
		System.out.println(m);
	}
	String grade(int data)
	{
		if(data>=90)
			return "A";
		else if(data>=75 && data<=89)
			return "B";
		else if(data<=74 && data>=50)
			return "C";
		else
			return "Fail";
	}

}
