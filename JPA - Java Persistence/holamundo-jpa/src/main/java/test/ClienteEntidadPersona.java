package test;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        //ver archivo persistence.xml que el personaPU es la unidad de persistencia 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("personaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //Iniciamos una transaccion para poder empezar a trabajar con la base de datos
        tx.begin();
        
        Persona persona1 = new Persona("Walter","Baya","walterbaya@yahoo.com", "1123183829");
        log.debug("Objeto a persistir" + persona1);
        
        //persistimos el objeto en la base de datos con el metodo persist
        
        em.persist(persona1);
    
        //Hasta que no hagamos el commit no se va a persistir
        
        tx.commit();
        
        //ahora deberiamos ver el id en el log
        log.debug("Objeto persistido" + persona1);
    
        em.close();
    }
    
}
