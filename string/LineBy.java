package com.string;
import java.util.Scanner;
public class LineBy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		System.out.println("Enter the name");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("the name ar following:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
