/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import streamingweb.entity.Film;

/**
 *
 * @author Formation
 */
public interface FilmDAO {
    
    public List<Film> lister(); // 2 CTRL + ESPACE à la suite pour qu'il me prenne Film qui se trouve dans un autre package (sinon CTRL SHIFT i)
    
    public Film trouveDetailsFilm(long id);
    
    public void ajouterFilm(Film f); // je l'appelle depuis la servlet, elle est overridée dans FilmDAOJpaImpl
    
}
