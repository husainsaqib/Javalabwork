package LabAssignment;
import java.util.Scanner;
public class Customer2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter PIN: ");
        int pin = s.nextInt();

        System.out.print("Enter Balance: ₹");
        double balance = s.nextDouble();

        System.out.print("Enter Withdrawal Amount: ₹");
        double withdraw = s.nextDouble();
        Customer2 r=new Customer2();
        r.bill(pin,balance,withdraw);

	}
    void bill(int a,double b,double w)
    {
    	  int p=1234;
    	  if (a != p) {
              System.out.println("Invalid PIN.");
          }
          else if (w > b) {
              System.out.println("Insufficient balance.");
          }
          else if ((b - w) < 1000) {
              System.out.println("Withdrawal denied. Minimum balance of ₹1000 must be maintained.");
          }
          else {
              b = b - w;
              System.out.println("Withdrawal successful.");
              System.out.println("Remaining Balance: ₹" + b);
          }

    }
}
