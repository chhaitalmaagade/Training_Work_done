package com.example.day07;

public class FanRunner {
    public static void main(String[] args) {

        Fan fan = new Fan("Manufacture 1", 0.34567,"Green");

        fan.SwitchOn();
        fan.setSpeed((byte)3);
        System.out.println(fan);


        fan.SwitchOff();
        System.out.println(fan);


    }
}

