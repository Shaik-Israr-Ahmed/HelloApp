package com.example;

public class Hello_App {
    public static void main(String[] args) {
    	String names;
        if (args.length == 0) {
            names = "World";
        } else {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}