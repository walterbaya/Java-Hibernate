package educacionit.jpa;

import educacionit.jpa.dao.ProductoDao;
import educacionit.jpa.dao.ProductoDaoImpl;
import educacionit.jpa.entidades.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegradorApplication implements CommandLineRunner {

    @Autowired
    ProductoDao p;

    @Autowired
    ProductoDaoImpl impl;

    public static void main(String[] args) {
        SpringApplication.run(IntegradorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Producto producto = new Producto(2400,"mermelada");
        //p.save(producto);

        //Producto nuevo = impl.getProducto("alfajor");
        //System.out.println(nuevo.toString());
        //Producto nuevo2 = p.getProducto(1);
        //System.out.println(nuevo2.toString());
        //boolean res = p.existe("alfajore");
        //System.out.println(res);
        /*
        List<Producto> res = impl.getProductosConPrecio(24);
        res.forEach(p -> System.out.println(p.toString()));
         */
        Producto productoNuevo = new Producto(1234, "crema");
        productoNuevo.setId(1);
        p.modifica(productoNuevo);

        p.getProductos().forEach(o -> System.out.println((o.toString())));
    }

}
