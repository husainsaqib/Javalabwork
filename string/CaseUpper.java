package com.string;
import java.util.Scanner;
public class CaseUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String a=sc.next();
		String k="";
		for(int i=0;i<a.length();i++)
		{
			k+=(char)(a.charAt(i)-32);
		}
		System.out.println(k);
		
sc.close();
	}

}
