/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streamingweb.entity.Film;
import streamingweb.service.FilmService;
import streamingweb.service.FilmServiceImpl;

/**
 *
 * @author Formation
 */
@WebServlet(name = "DetailsServlet", urlPatterns = {"/details_film"})
public class DetailsFilmServlet extends HttpServlet {

    private FilmService service = new FilmServiceImpl();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // 1. Récupérer l'id du film sélectionné
        String idString = req.getParameter("idFilm");
        
        // 2. Récupérer le film à partir de la BD (et de l'id)
        Film film = service.rechercheParId( Long.parseLong(idString) );
        
        // 3. set film en attribut de requête
        req.setAttribute("film", film);
        
        // 4. forward -> jsp
        req.getRequestDispatcher("details_film.jsp").forward(req, resp);
    }

   
}
