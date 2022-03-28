package com.example.day06;

import jdk.dynalink.beans.StaticClass;

public class DayOfWeekRunner {
    public static void main(String[] args) {


        String[] DaysOfWeek ={"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        String most_letters = "";
        for (String day:DaysOfWeek) {
            if (most_letters.length()<day.length()){
                most_letters = day;

            }



        }
        System.out.println("Most number of letters :"+most_letters);

        for(int i = DaysOfWeek.length-1; i>=0;i--){
            System.out.print(DaysOfWeek[i]+" ,");



        }

    }
}
