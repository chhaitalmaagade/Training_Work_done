package com.in28minutes.oops;

public class motorBike {

   private int speed;

    void start()
    {
        System.out.println("Bike has started");
    }


    void setSpeed(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return  this.speed;
    }
}
