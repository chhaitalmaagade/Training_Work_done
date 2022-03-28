package com.in28minutes.oops;

public class Book {
    private  int noOfCopies;

    public void setNoOfCopies(int num_of_copies){
        if(num_of_copies>0)
            this.noOfCopies = num_of_copies;
    }

    public void increase_num_of_copies(int howMuch){
        setNoOfCopies(this.noOfCopies + howMuch);
    }


}
