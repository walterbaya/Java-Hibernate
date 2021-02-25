package com.example.educacionIT.TablePerClass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "VEHICLES")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle implements Serializable {

    @Id
    private Integer id;
    private String engine;

    public Vehicle() {
    }

    public Vehicle(Integer id, String engine) {
    	this.id = id;
        this.engine = engine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
