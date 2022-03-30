package com.example.day07;

public class Customer {
    private String name;
    private Address workaddress;
    private Address homeAddress;


    public Customer(String name, Address homework){
        this.name = name;
        this.homeAddress = homeAddress;


    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", workaddress=" + workaddress +
                ", homeAddress=" + homeAddress +
                '}';
    }
}
