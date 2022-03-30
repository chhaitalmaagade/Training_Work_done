package com.example.day07;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeaddress = new Address("line1", "Bombay","400709");
        Customer cust1 = new Customer("Ranga",homeaddress);

        Address workaddress = new Address("line_work","Mumbai","400056");
        cust1.setWorkaddress(workaddress);

        System.out.println(cust1);
    }


}
