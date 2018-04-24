/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.GenreDAO;
import streamingweb.dao.GenreDAOJpaImpl;
import streamingweb.entity.Genre;

/**
 *
 * @author Formation
 */
public class GenreServiceImpl implements GenreService {

    private GenreDAO dao = new GenreDAOJpaImpl();
            
    @Override
    public List<Genre> listerGenres() {
        
        return dao.listerGenres();
    }
    
    
    
}
