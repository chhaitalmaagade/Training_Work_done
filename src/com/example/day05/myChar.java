package com.example.day05;

public class myChar {
    private  char ch;

    public  myChar(char ch){
        this.ch = ch;
    }

    public boolean isVowel(){

        if(ch == 'a' || ch =='e'||ch=='i'||ch=='o'||ch=='u')

            return true;

        return false;



    }



    public boolean isDigit(){
        if(ch>=48 && ch<=57)
            return true;
        return false;

    }


}
