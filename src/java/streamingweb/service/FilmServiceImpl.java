/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.FilmDAO;
import streamingweb.dao.FilmDAOJpaImpl;
import streamingweb.entity.Film;

/**
 *
 * @author Formation
 */

// Surcouche, son rôle est d'appeler le DAO

public class FilmServiceImpl implements FilmService {
    
    private FilmDAO dao = new FilmDAOJpaImpl();
    
    @Override
    public List<Film> listerFilms() {
        
        return dao.lister();
    }

    @Override
    public Film rechercheParId(long id) {
        
        return dao.trouveDetailsFilm(id); // Il attend que l'on retourne un Film
    }

    @Override
    public void ajouterFilm(Film f) {
        
        dao.ajouterFilm(f);
    }
    
    
    
}
