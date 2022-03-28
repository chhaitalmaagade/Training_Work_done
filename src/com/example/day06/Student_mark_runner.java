package com.example.day06;


import java.math.BigDecimal;

public class Student_mark_runner {
    public static void main(String[] args) {

//        int[] marks = new int[3];
        //int[] marks = {99,98,100};

        Student_mark student = new Student_mark("Ranga",99,98,100 );
         int number = student.getNumberOfMarks();
        System.out.println("Number of mark student has "+number);

        int sum = student.getSumOfMarks();
        System.out.println("Sum of the marks is "+sum);

        int maximum_mark = student.getMaximum_marks();
        System.out.println("Maximum marks for the student "+maximum_mark);


        BigDecimal average_marks = student.getAverageMarks();
        System.out.println("Average marks is "+average_marks);


    }
}
