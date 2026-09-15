package LabAssignment;
import java.util.Scanner;
public class Ticket {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		Ticket r=new Ticket();
		int i=r.price(age);
		System.out.println("The ticket price is "+i);
	}
	int price(int data)
	{
		if(data<5)
			return 0;
		else if(data>=5 && data<=18)
			return 100;
		else if(data>=19 && data<=60)
			return 200;
		else
			return 150;
	}

}
