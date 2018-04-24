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
import streamingweb.entity.Genre;

/**
 *
 * @author Formation
 */
public class GenreDAOJpaImpl implements GenreDAO {

    @Override
    public List<Genre> listerGenres() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query q = em.createQuery("SELECT g FROM Genre g ORDER BY g.nom");
        
        return q.getResultList();
    }
    
}
