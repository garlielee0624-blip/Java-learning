package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("Enter your name (type 'exit' to quit): ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Hello, " + name + "! Nice to meet you ");
        }

        scanner.close();
    }
}