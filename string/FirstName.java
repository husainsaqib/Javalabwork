package com.string;
import java.util.Scanner;
public class FirstName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		System.out.println("Enter the name");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<arr.length;i++)
		{
			String current=arr[i];
			arr[i]=Character.toUpperCase(current.charAt(0)) + current.substring(1).toLowerCase();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		sc.close();

	}

}
