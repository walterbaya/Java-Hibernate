package com.example.Main.entidadesJerarquia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name = "TIENDASJ")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class TiendaJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identificador_tienda")
	private Integer id;  
	private String nombre;
	private String ubicacion;
	private int clientes;

	public TiendaJ() {

	}

	public TiendaJ(String nombre, String ubicacion, int clientes) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.clientes = clientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getClientes() {
		return clientes;
	}

	public void setClientes(int clientes) {
		this.clientes = clientes;
	}

}
