package com.example.Main.entidadesJerarquia;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@DiscriminatorColumn(name = "C")
@Entity
public class LocalDeComida extends TiendaJ {

	private String marcasPizzas;
	private String marcasDeHamburguesa;
	private int hamburguesasVendidas;
	private int pizzasVendidas;

	public LocalDeComida() {

	}

	public LocalDeComida(String nombre, String ubicacion, int clientes, String marcasPizzas, String marcasDeHamburguesa,
			int pizzasVendidas, int hamburguesasVendidas) {
		super(nombre, ubicacion, clientes);
		this.marcasPizzas = marcasPizzas;
		this.marcasDeHamburguesa = marcasDeHamburguesa;
		this.hamburguesasVendidas = hamburguesasVendidas;
		this.pizzasVendidas = pizzasVendidas;
	}

	public String getMarcasPizzas() {
		return marcasPizzas;
	}

	public void setMarcasPizzas(String marcasPizzas) {
		this.marcasPizzas = marcasPizzas;
	}

	public String getMarcasDeHamburguesa() {
		return marcasDeHamburguesa;
	}

	public void setMarcasDeHamburguesa(String marcasDeHamburguesa) {
		this.marcasDeHamburguesa = marcasDeHamburguesa;
	}

	public int getHamburguesasVendidas() {
		return hamburguesasVendidas;
	}

	public void setHamburguesasVendidas(int hamburguesasVendidas) {
		this.hamburguesasVendidas = hamburguesasVendidas;
	}

	public int getPizzasVendidas() {
		return pizzasVendidas;
	}

	public void setPizzasVendidas(int pizzasVendidas) {
		this.pizzasVendidas = pizzasVendidas;
	}
}
