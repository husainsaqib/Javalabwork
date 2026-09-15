package LabAssignment;

import java.util.Scanner;

public class Customer1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your balance");
		int a2=s.nextInt();
		System.out.println("Enter the amount to withdraw ");
		int a3=s.nextInt();
		Customer1 r=new Customer1();
		String m=r.isPossible(a2,a3);
		System.out.println(m);

	}

	String isPossible(int a,int b)
	{
		if (a>b)
			return "Withdrawal is Possible";
		else
			return "Withdrawal is not Possible";
	}
}
