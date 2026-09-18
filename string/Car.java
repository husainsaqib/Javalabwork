package com.string;

public class Car {
	String make;
    String model;
    int year;
    String color;
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    void display() {
        System.out.println("Car Details");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Color : " + color);
    }
    public static void main(String[] args) {
    	 Car c1 = new Car("Toyota", "Fortuner", 2024, "Black");
         c1.display();

	}

}
