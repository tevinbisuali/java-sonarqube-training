package com.example;

public class App {

    public static void main(String[] args) {
        printInfo("John", "User", "Basic", "IT", "Dallas");
        printInfo("Alice", "Admin", "Full", "IT", "Dallas");
    }

    public static void printInfo(String name, String role, String access, String department, String location) {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Access: " + access);
        System.out.println("Department: " + department);
        System.out.println("Location: " + location);
    }
}
