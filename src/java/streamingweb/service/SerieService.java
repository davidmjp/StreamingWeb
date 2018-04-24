/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.entity.Serie;

/**
 *
 * @author Formation
 */
public interface SerieService {
    
    public List<Serie> listerSeries(); 

    public Serie rechercheParId(long id);
    
    public long compterNbEpisodes(long idSerie);
    
}
