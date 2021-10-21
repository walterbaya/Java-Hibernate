package sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import sga.domain.Persona;

//Debe ser un ejb para poder inyectar el EntityManager de JPA por eso ponemos el stateless
@Stateless
public class PersonaDaoImpl implements PersonaDao{
 
    @PersistenceContext(unitName = "personaPU")
    EntityManager em; 

    @Override
    public List<Persona> findAllPersonas() {
        //Usamos el named query que definimos anteriormente
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona)query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        //Sincroniza con la base de datos cualquier cambio que le hayamos hecho al objeto persona
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        //Primero hay que actualizar el objeto y una vez actualizado y sincronizado
        //lo borramos.
        em.remove(em.merge(persona));
    }
}
