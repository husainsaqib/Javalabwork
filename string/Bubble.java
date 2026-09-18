package com.string;

import java.util.Scanner;

public class Bubble {

    String name;
    int id;
    double grade;

    Bubble(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    static void displayStudents(Bubble arr[]) {
        for (Bubble k : arr) {
            if (k != null) {
                System.out.println("Name : " + k.name);
                System.out.println("ID   : " + k.id);
                System.out.println("Grade: " + k.grade);
                System.out.println("-------------------");
            }
        }
    }
    static void sortStudents(Bubble arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].grade > arr[j + 1].grade) {
                    Bubble temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Bubble arr[] = new Bubble[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student name:");
            String name = s.next();

            System.out.println("Enter student ID:");
            int id = s.nextInt();

            System.out.println("Enter student grade:");
            double grade = s.nextDouble();

            arr[i] = new Bubble(name, id, grade);
        }
        sortStudents(arr);
        System.out.println("\nStudents Sorted by Grade (Ascending):");
        displayStudents(arr);

        s.close();
    }
}