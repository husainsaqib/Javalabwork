package LabAssignment;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int avg=(a+b+c)/3;
		Marks r=new Marks();
		String m=r.result(avg);
		System.out.println(m);
		}
	String result(int data)
	{
		if(data>=35)
			return "Pass";
		else
			return "Fail";
	}
	

}
