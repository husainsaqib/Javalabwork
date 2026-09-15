package com.Exception;

import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args){
        ArrayExample r=new ArrayExample();
        r.searchElement();

    }
    void searchElement()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the index element: ");
        int s=sc.nextInt();
        System.out.println("The element present at index "+s+" is "+arr1[s]);
        sc.close();

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds.");
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
