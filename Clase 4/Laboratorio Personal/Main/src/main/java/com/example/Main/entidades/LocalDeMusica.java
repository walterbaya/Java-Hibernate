package com.example.Main.entidades;

import javax.persistence.Entity;

@Entity(name = "LOCALES_DE_MUSICA")
public class LocalDeMusica extends Tienda {

	private String marcasGuitarra;
	private String marcasBajos;
	private String marcasBaterías;
	private double ganacias;
	private boolean ventaOnline;

	public LocalDeMusica() {
		
	};
	public LocalDeMusica(String nombre, String ubicacion, int clientes, String marcasGuitarra,
			String marcasBajos, String marcasBaterías, double ganacias, boolean ventaOnline) {
		super(nombre, ubicacion, clientes);
		this.marcasGuitarra = marcasGuitarra;
		this.marcasBajos = marcasBajos;
		this.marcasBaterías = marcasBaterías;
		this.ganacias = ganacias;
		this.ventaOnline = ventaOnline;
	}

	public String getMarcasGuitarra() {
		return marcasGuitarra;
	}

	public void setMarcasGuitarra(String marcasGuitarra) {
		this.marcasGuitarra = marcasGuitarra;
	}

	public String getMarcasBajos() {
		return marcasBajos;
	}

	public void setMarcasBajos(String marcasBajos) {
		this.marcasBajos = marcasBajos;
	}

	public String getMarcasBaterías() {
		return marcasBaterías;
	}

	public void setMarcasBaterías(String marcasBaterías) {
		this.marcasBaterías = marcasBaterías;
	}

	public double getGanacias() {
		return ganacias;
	}

	public void setGanacias(double ganacias) {
		this.ganacias = ganacias;
	}

	public boolean isVentaOnline() {
		return ventaOnline;
	}

	public void setVentaOnline(boolean ventaOnline) {
		this.ventaOnline = ventaOnline;
	}

}
