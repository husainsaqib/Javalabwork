package LabAssignment;
import java.util.Scanner;
public class Store {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		int puram=s.nextInt();
		Store r=new Store();
		int pa=r.bill(puram);
		System.out.println("The payable amount is "+pa);
		

	}
	int bill(int data)
	{
		if (data<2000)
			return data;
		else if(data>=2000 && data<5000)
			return data-(data*10)/100;
		else
			return data-(data*20)/100;
	}

}
