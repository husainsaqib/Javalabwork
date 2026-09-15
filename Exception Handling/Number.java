package com.Exception;
import java.util.Scanner;
class Number{
    public static void main(String args[]){
        Number obj = new Number();
        obj.isDiv();
       
       
    
}
void isDiv(){
    try
    {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("The division of two numbers is: "+c);
         sc.close();
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}