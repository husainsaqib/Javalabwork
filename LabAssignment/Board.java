package LabAssignment;
import java.util.Scanner;
public class Board {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the units");
		int a=s.nextInt();
		Board r=new Board();
		int b=r.bill(a);
		System.out.println("The bill is "+b);

	}
	int bill(int data)
	{
		
		if(data<=100)
			return data*5;
		else if(data>100 && data<=300)
			return data*7;
		else
			return data*10;
			
	}

}
