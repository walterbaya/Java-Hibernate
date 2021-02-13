package com.educacionit.jse.integrador.main;

import com.educacionit.jse.integrador.baseDeDatos.ProductoDAO;
import com.educacionit.jse.integrador.entidades.Cliente;
import com.educacionit.jse.integrador.entidades.Domicilio;
import entidades.Producto;
import com.educacionit.jse.integrador.entidades.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    ProductoDAO p;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Telefono telefono = new Telefono("Laboral", "4393-2212");
        Domicilio domicilio = new Domicilio(1243, "Lavalle", "CABA");
        Cliente cliente = new Cliente("Juan", "Perez", domicilio, telefono, 221212);
        Producto producto = new Producto(22.21, "Cafe Molido");

        //guardo el producto
        p.save(producto);

    }

}
