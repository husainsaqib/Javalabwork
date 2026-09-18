package com.string;
import java.util.Scanner;
public class Book
{
 String bname;
 String author;
 int isbn;
 Book(){    }
 Book (String bname,String author,int isbn)
 {
     this.bname= bname;
     this.author=author;
     this.isbn=isbn;
     
 }
 void display()    
 {
	 System.out.println( bname+ " "+ author+" "+ isbn); 
}
 int search(Book k[],String searchbook)
 {
     for(Book x:k)
     {
         if(x.bname.equals(searchbook))
          {
             System.out.println(" record found");
      return 1;        
          }
     }
     return 0;
 }
 public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     Book e[]= new Book[5];
     for(int i=0;i<5;i++)
     { System.out.println("enter book name");
         String a= s.next();
         System.out.println("enter book author");
      String b= s.next();
      System.out.println("enter book isbn");
      int c= s.nextInt();
      
         e[i]= new Book(a,b,c);
         
     }
     
     int found=0;
    
     Book k= new Book();
     for(int i=0;i<5;i++)
     {
         found=k.search(e,"harry");
         if(found==1)break;
     }
     
     if(found==0)
         System.out.println("book not found");
     s.close();
     }

     
     }