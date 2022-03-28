package com.example.day06;

import java.math.BigDecimal;

public class Student_mark {

    private int[] marks;
    private String name;


    public Student_mark(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }


    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getSumOfMarks() {
        int sum =0;

        for (int mark:marks) {
            sum +=mark;

        }

        return sum;
    }

    public int getMaximum_marks() {

        int maximum_mark = Integer.MIN_VALUE;
        for (int maximum:marks) {
            if (maximum_mark<maximum){
                maximum_mark = maximum;
            }


        }
        return maximum_mark;
    }

    public BigDecimal getAverageMarks() {

        BigDecimal average_marks = BigDecimal.valueOf(getSumOfMarks()/getNumberOfMarks());

        return average_marks;


    }
}
