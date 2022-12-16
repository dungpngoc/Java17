package main.java.polymorphism_demo;

import java.util.Arrays;

public class Example {
    public static void print(String name) {
        System.out.println(name);
    }

    public static void print(String name, String email) {
        System.out.println(name);
        System.out.println(email);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        print("Dũng");
        print(10);
        print("Huy","huy@gmail.com");

    }
}
