package com.SudipJavaCodes;

import java.util.Scanner;
public class Sum_n_numbers {
    public static void main(String[]args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first n numbers are: "+sum);
    }
}

