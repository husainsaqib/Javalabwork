package com.FileHandling;

import java.io.Serializable;

public class Book implements Serializable {

    private String bname;
    private String aname;
    private double price;

    public Book(String bname, String aname, double price) {
        this.bname = bname;
        this.aname = aname;
        this.price = price;
    }

    public String getBname() {
        return bname;
    }

    public String getAname() {
        return aname;
    }

    public double getPrice() {
        return price;
    }

    
	public Object display() {
		return "Book Name : " + bname +
                "\nAuthor : " + aname +
                "\nPrice : ₹" + price +
                "\n-------------------------\n";
	}

	public String display1() {
		return "Book Name : " + bname +
        "\nAuthor : " + aname +
        "\nPrice : ₹" + price +
        "\n-------------------------\n";
	}
}