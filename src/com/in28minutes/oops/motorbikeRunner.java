package com.in28minutes.oops;

public class motorbikeRunner {
    public static void main(String[] args) {
        motorBike ducati = new motorBike(100);
        motorBike honda = new motorBike(80);


        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);

        int hondaSpeed = honda.getSpeed();
        hondaSpeed = hondaSpeed + 150;
        honda.setSpeed(hondaSpeed);

        System.out.println(honda.getSpeed());

        System.out.println(ducati.getSpeed());

    }
}
