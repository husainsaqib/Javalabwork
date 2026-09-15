package LabAssignment;
import java.util.Scanner;
public class Admin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Username");
		String a=s.next();
		System.out.println("Enter Password");
		int b=s.nextInt();
		Admin r=new Admin();
		String m=r.credential(a,b);
		System.out.println(m);
	}
	String credential(String a,int b)
	{
		if(a.equals("admin") && b==1234)
			return "Login Successful";
		else
			return "Invalid Username or Password";
	}

}
