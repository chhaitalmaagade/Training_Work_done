package com.example.day02;

public class argument {

    static void argument(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }


        static void square(int n){

            for(int i =1; i<=n;i++){
                System.out.println(i*i);
            }
        }




    public static void main(String[] args) {
        argument(5);
        square(3);
    }
}
