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
import streamingweb.entity.Serie;

/**
 *
 * @author Formation
 */
public class SerieDAOJpaImpl implements SerieDAO {

    @Override
    public List<Serie> lister() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query q = em.createQuery("SELECT s FROM Serie s");
        
        return q.getResultList();
    }
    
    @Override
    public long compterNbEpisodes(long idSerie) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query q= em.createQuery("SELECT COUNT(e) FROM Episode e JOIN e.saison s JOIN s.serie se WHERE se.id=:idDeMaSerie");
        q.setParameter("idDeMaSerie", idSerie);
        
        return (long) q.getSingleResult();
    }

    

    @Override
    public Serie rechercheParId(long id) {
        
      EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
      
      return em.find(Serie.class, id);
      
    }
}
