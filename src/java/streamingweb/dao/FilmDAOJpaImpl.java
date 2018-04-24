/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streamingweb.entity.Film;

/**
 *
 * @author Formation
 */

// Java Class normale (DAO = data access objet)
// D'abord cliquer sur l'erreur de compilation avant d'entrer qch entre les { } et ajouter le Override qu'il propose, puis changer ce qu'il y a à l'intérieur du Override (implement all abstract method)
public class FilmDAOJpaImpl implements FilmDAO {

    @Override
    public List<Film> lister() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query q = em.createQuery("SELECT f FROM Film f");
        
        return q.getResultList();
    }

    @Override
    public Film trouveDetailsFilm(long id) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Film.class, id);
        
    }

    @Override
    public void ajouterFilm(Film f) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

}
