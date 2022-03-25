package com.example.day04;

import java.util.Scanner;

public class multi_5_3 {
    public static void main(String[] args) {
        System.out.println("Enter value for n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++) {
            System.out.printf("Multiplication for 5 * i is :%d * %d = %d",n,i,n*i).println();
        }
    }
}
