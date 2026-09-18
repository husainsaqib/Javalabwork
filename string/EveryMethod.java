package com.string;

public class EveryMethod {

	public static void main(String[] args) {
		  String str = "Hello Java";

	        System.out.println("Original String: " + str);
	        System.out.println("Length: " + str.length());
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        System.out.println("Character at index 4: " + str.charAt(4));
	        System.out.println("Substring (6): " + str.substring(6));
	        System.out.println("Substring (0,5): " + str.substring(0,5));
	        System.out.println("Index of 'Java': " + str.indexOf("Java"));
	        System.out.println("Contains 'Java': " + str.contains("Java"));
	        System.out.println("Replace 'Java' with 'World': " + str.replace("Java","World"));
	        System.out.println("Equals 'Hello Java': " + str.equals("Hello Java"));
	        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello java"));
	        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
	        System.out.println("Ends with 'Java': " + str.endsWith("Java"));
	        String s = "  Welcome  ";
	        System.out.println("Trim: '" + s.trim() + "'");

	}

}
