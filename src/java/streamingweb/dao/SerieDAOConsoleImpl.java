/*

EXEMPLE, on ne l'utilise pas dans notre projet.
On pourrait créer 

...Impl.java classe qui implémente une interface

*/
package streamingweb.dao;

import java.util.List;
import streamingweb.entity.Serie;

/**
 *
 * @author Formation
 */
public class SerieDAOConsoleImpl implements SerieDAO{

    @Override
    public List<Serie> lister() {
        return null;
    }

    @Override
    public long compterNbEpisodes(long idSerie) {
        return 10;
    }

    @Override
    public Serie rechercheParId(long id) {
        return null;
    }
    
}
