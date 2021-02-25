package com.example.educacionIT.TablePerClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TablePerClassApplication implements CommandLineRunner {

	@Autowired
	ShipDao sd;
	@Autowired
	PlaneDao pd;

	public static void main(String[] args) {
		SpringApplication.run(TablePerClassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ship s1 = new Ship(1,"Diesel", 200);
		sd.save(s1);
		Plane p1 = new Plane(1,"Fuel",20,true);
		pd.save(p1);
	}

}
