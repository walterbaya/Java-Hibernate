package com.example.educacionIT.TablePerClass;

import javax.persistence.*;

@Entity
@Table(name = "ships")
public class Ship extends Vehicle{
    private int size;

    public Ship() {
    }

    public Ship(Integer id,String engine, int size) {
        super(id,engine);
        this.size = size;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }
    
}
