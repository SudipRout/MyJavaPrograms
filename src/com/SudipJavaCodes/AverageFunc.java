package com.SudipJavaCodes;

import java.util.Scanner;

public class AverageFunc {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        
        System.out.println("The average of the three numbers are: " +printAverage(a, b, c));
    }
    public static double printAverage(double a, double b, double c) {
        return (a+b+c)/3;
    }
}