package com.string;
import java.util.Scanner;
public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();
		CountCharacter r=new CountCharacter();
		int n=r.count(a);
		System.out.println("Lenght of String:"+n);
		sc.close();

	}
	int count(String p)
	{
		return p.length();
	}

}
