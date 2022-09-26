package com.minecode.hello.Models;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long number;

    @Column
    private String name;

    @Column
    private String dicription;
    
    @Column
    private int cost;

    public long getNumber() {
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDiscription(){
        return dicription;
    }
    public void setDiscription(String dicription){
        this.dicription = dicription;
    }

    public int getCost(){
        return cost;
    }
    public void setcost(int cost){
        this.cost = cost;
    }
}
