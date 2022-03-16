package com.oleson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Print("A well-formed Java program has\na main method with { and }\nbraces.\n\nA System.out.println statement");
        Print("has { and } and usually a\nString that starts and ends with a \" character.\n(But we type \\\" instead!)");
    }

    private static void Print(String message) {
        System.out.println(message);
    }
}
