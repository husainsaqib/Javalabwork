package LabAssignment;
import java.util.Scanner;
public class Number2 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		Number2 r=new Number2();
		String m=r.isLargest(a,b);
		System.out.println(m);
	}
	String isLargest(int a1,int a2)
	{
		if(a1>a2)
			return a1+" is large";
		else
			return a2+" is Large";
	}

}
