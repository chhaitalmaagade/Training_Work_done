package com.in28minutes.oops;

public class motorBike<increaseSpeed> {

   private int speed;

    public motorBike(int i) {

        this.speed = i;
    }

    void start()
    {
        System.out.println("Bike has started");
    }


//    MotorBike(int speed) {
//        this.speed = speed;
//
//    }

    //MotorBike(){
     //       this(5);

       //}



    public void setSpeed(int speed){
        if (speed >0)
            this.speed = speed;
    }
    public int getSpeed(){
        return  this.speed;
    }

    public  void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed - howMuch);
    }

}
