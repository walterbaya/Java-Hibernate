package com.example.Laboratorio2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "persona_id")
    private Integer id;
    private String nombre;
    private String apellido;
    private int edad;

    //@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL ,orphanRemoval = true)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "persona_id")
    private List<Telefono> telefonos = new ArrayList<>();

    //El lazy no se como manejarlo hay que usarlo con Session y hay que tener entendimiento
    //Para entender como funciona correctamente hay que entender en profundidad el uso de jpa y hibernate
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY /*, fetch = FetchType.EAGER*/)
    @JoinColumn(name = "dom_id", nullable = false, insertable = false)
    private List<Domicilio> domicilios = new ArrayList<>();

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Domicilio> getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(List<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }

}
