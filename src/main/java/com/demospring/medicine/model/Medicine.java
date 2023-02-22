package com.demospring.medicine.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Medicine")
public class Medicine implements Serializable{

    //Declare id, name, address:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Price")
    private double price;
    @Column(name = "Amount")
    private double amount;


    public Medicine() {
    }

    public Medicine(int id, String name, double price, double amount) {
        this.id = id;
        this.Name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPrice(double Price){this.price = Price;}

    public double getPrice(){return price;}

    public void setAmount(double amount){this.amount = amount;}

    public double getAmount(){return amount;}


    /*
    public String getAddress() {
        return address;
    }
    */
    /*
    public void setAddress(String address) {
        this.address = address;
    }
    */
}
