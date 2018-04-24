/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.entity.Film;

/**
 *
 * @author Formation
 */
public interface FilmService {
    
    public List<Film> listerFilms(); // On a une fonction listerFilms() qui doit return une liste ! Il n'y a pas d'action ici, c'est juste une déclaration.s
    
    public Film rechercheParId(long id);
        
    public void ajouterFilm(Film f);
    
}
