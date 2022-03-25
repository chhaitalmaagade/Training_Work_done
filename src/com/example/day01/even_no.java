package com.example.day01;

import java.util.Scanner;

public class even_no {
    public static void main(String[] args) {

        System.out.println("Enter number to check if it even or odd");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) {
            System.out.println("The number entered is even");
        }else{
            System.out.println("It is an odd number");
        }

    }
}
