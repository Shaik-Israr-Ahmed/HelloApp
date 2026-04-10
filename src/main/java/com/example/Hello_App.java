package com.example;

public class Hello_App {
    public static void main(String[] args) {
    	String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            names = nameBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}