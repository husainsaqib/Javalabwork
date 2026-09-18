package com.string;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a=sc.next();
	
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b+=a.charAt(i);
		}
		if(a.compareTo(b)==0)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		sc.close();
	}

}
