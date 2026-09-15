package LabAssignment;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=s.nextInt();
		Leap r=new Leap();
		String m=r.isLeap(a);
		System.out.println(m);
	}
	String isLeap(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			return year+" is leap year";
		else
			return year+" is not leap year";
	}

}
