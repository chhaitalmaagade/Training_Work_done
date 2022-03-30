package com.example.day07;

public class Fan {
    private  String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; //0 to 5


    //creation
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius =radius;
        this.color = color;


    }

    @Override
    public String toString() {
        return "Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", speed=" + speed +
                '}';
    }

    public void SwitchOn(){

        this.isOn = true;
        setSpeed(this.speed);
    }

    public void SwitchOff(){
        this.isOn =false;
        setSpeed((byte) 0);
    }

    public  void setSpeed(byte speed){
        this.speed = speed;
    }

    public void getSpeed(){
        this.speed = speed;

    }
}



