/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import streamingweb.entity.Genre;

/**
 *
 * @author Formation
 */
public interface GenreDAO {
    
    public List<Genre> listerGenres();
    
}
