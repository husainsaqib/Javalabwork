package LabAssignment;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary");
		int a=s.nextInt();
		System.out.println("Enter the experience");
		int b=s.nextInt();
		Bonus r=new Bonus();
		int m=r.experience(a,b);
		System.out.println("Total salary is "+m);

	}
	int experience(int a1,int a2)
	{
		if(a2>5)
			return a1+(a1*20)/100;
		else if(a2>=2 && a2<=5)
			return a1+(a1*10)/100;
		else 
			return a1;
	}

}
