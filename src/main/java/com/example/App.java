package com.example;

public class App {

    public static void main(String[] args) {
        String password = "admin123";
        System.out.println(password);

        printUserInfo();
        printAdminInfo();
    }

    public static void printUserInfo() {
        System.out.println("Name: John");
        System.out.println("Role: User");
        System.out.println("Access: Basic");
        System.out.println("Department: IT");
        System.out.println("Location: Dallas");
    }

    public static void printAdminInfo() {
        System.out.println("Name: John");
        System.out.println("Role: User");
        System.out.println("Access: Basic");
        System.out.println("Department: IT");
        System.out.println("Location: Dallas");
    }
}
