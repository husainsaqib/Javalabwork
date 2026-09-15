package LabAssignment;
import java.util.Scanner;
public class Voter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=s.nextInt();
		Voter r=new Voter();
		String m=r.isEligible(a);
		System.out.println(m);
		
		

	}
	String isEligible(int data)
	{
		if(data<18)
			return "Not eligible";
		else 
			return "Eligible";
	}
}
