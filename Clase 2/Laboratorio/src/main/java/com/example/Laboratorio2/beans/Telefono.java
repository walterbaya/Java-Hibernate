package com.example.Laboratorio2.beans;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Telefono implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tel_id")
    private Integer id;
    private String tipo;
    private int numero;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Telefono(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public Telefono() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
