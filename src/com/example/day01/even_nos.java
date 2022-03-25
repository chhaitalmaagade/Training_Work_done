package com.example.day01;

import java.util.Scanner;

public class even_nos {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        while(count<20){
            if(n%2==0) {
                System.out.println("n =" + n);
            }n++;
                count++;
            }

        }
    }

