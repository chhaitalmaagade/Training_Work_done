package com.example.day07;

public class Rectangle {

    private  int lenght;
    private  int breadth;


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectangle(int lenght, int breadth ){
        this.lenght = lenght;
        this.breadth = breadth;


    }

    public int area(){
        return  lenght*breadth;
    }

    public int perimeter(){
        return  2*(lenght+breadth);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", breadth=" + breadth +
                '}';
    }
}
