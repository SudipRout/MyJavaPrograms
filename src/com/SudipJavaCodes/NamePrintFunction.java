package com.SudipJavaCodes;

// Print a given name in a function
import java.util.*;
public class NamePrintFunction {
    public static void printMyName(String name) {
        System.out.println(name);
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();

        printMyName(name);
    }
}