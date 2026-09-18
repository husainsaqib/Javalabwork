package com.string;

import java.util.Scanner;

public class Student {
	String name;
	int id;
	double grade;
	
	Student(String name,int id,double grade)
	{
		this.name=name;
		this.id=id;
		this.grade=grade;
		
	}
	static void displayStudent(Student arr[])
	{
		for(Student k:arr)
		{
			  System.out.println("Name : " + k.name);
              System.out.println("ID   : " + k.id);
              System.out.println("Grade: " + k.grade);
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	     Student arr[]= new Student[3];
	     for(int i=0;i<3;i++)
	     { System.out.println("enter student name");
	         String a= s.next();
	         System.out.println("enter student id");
	      int id1= s.nextInt();
	      System.out.println("enter student grade");
	      double c= s.nextDouble();
	      
	         arr[i]= new Student(a,id1,c);
	         
	     }
	     displayStudent(arr);
	     s.close();
		
		
		
		
	}

}
