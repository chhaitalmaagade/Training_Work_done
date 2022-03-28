package com.example.day06;

public class DayOfWeek {

    private String[] DaysOfWeek ={"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};



    public void most_no_of_letters(String[] letters) {
        int MostNoOfLetters = 0;
        for (String day : DaysOfWeek) {

            if (MostNoOfLetters < day.length())
                MostNoOfLetters = day.length();



        }

        System.out.println("Most number of letter:" + this.DaysOfWeek[MostNoOfLetters]);

        //return letters;
    }

        public String[] getDaysOfweek(){
            return DaysOfWeek;
        }




}
