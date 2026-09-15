package LabAssignment;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		Number r=new Number();
		String m=r.evenodd(a);
		System.out.println("Number is "+m);

	}
	String evenodd(int data)
	{
		if(data%2==0)
			return "even";
		else
			return "odd";
	}

}
