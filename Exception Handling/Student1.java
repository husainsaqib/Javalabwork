package com.Exception;

public class Student1 {

    void AddStudent() {
        class MtechStudent implements Admission {
            public void registration() {
                System.out.println("M.Tech Student Registration Completed.");
            }
        }

        MtechStudent m1 = new MtechStudent();
        m1.registration();
        Admission a1 = new Admission() {
            public void registration() {
                System.out.println("Anonymous Student Registration Completed.");
            }
        };
        a1.registration();
    }

    public static void main(String[] args) {

        Student1 s = new Student1();
        s.AddStudent();

    }
}
