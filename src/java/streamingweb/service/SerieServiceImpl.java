/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.SerieDAO;
import streamingweb.dao.SerieDAOConsoleImpl;
import streamingweb.dao.SerieDAOJpaImpl;
import streamingweb.entity.Serie;

/**
 *
 * @author Formation
 */
public class SerieServiceImpl implements SerieService {

    /* Si on voulait changer d'implémentation (ou de classe d'implémentation, (différent de interface)) pour une sortie console par exemple, on aurait juste à changer ce qu'il y a après le new :
    private SerieDAO dao = new SerieDAOConsoleImpl();
    
    */
    
    
    private SerieDAO dao = new SerieDAOJpaImpl();
    
    
    @Override
    public List<Serie> listerSeries() {
        
        return dao.lister();
    }


    @Override
    public Serie rechercheParId(long id) {
        
        return dao.rechercheParId(id);
    }
    
    @Override
    public long compterNbEpisodes(long idSerie) {
        
        return dao.compterNbEpisodes(idSerie);
    }
    
}
