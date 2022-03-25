package com.example.day04;

import java.util.Scanner;

public class sum_of_var {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter value for a, b, c :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.printf("Addition of a, b, c :%d+%d+%d = %d",a,b,c,a+b+c).println();
    }
}
