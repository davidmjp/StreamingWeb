/*
 
Une interface fixe les fonctions qui doivent être implémentées par les classes qui implémentent cette interface


 */
package streamingweb.dao;

import java.util.List;
import streamingweb.entity.Serie;

/**
 *
 * @author Formation
 */
public interface SerieDAO {
    
    public List<Serie> lister();
    // public Serie trouveDetailsSerie(long id);
    public long compterNbEpisodes(long idSerie);
    
    public Serie rechercheParId(long id);
    
}
