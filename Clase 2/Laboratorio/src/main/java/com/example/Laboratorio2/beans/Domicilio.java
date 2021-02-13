package com.example.Laboratorio2.beans;

import java.io.Serializable;
import javax.persistence. *;

@Entity
public class Domicilio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dom_id")
    private Integer id;
    private String calle;
    private int numero;
    
    public Domicilio(){
    
    }
    
    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
