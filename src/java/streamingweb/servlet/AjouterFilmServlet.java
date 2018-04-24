/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streamingweb.entity.Film;
import streamingweb.entity.Genre;
import streamingweb.service.FilmService;
import streamingweb.service.FilmServiceImpl;
import streamingweb.service.GenreService;
import streamingweb.service.GenreServiceImpl;

/**
 *
 * @author Formation
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {
    
    private GenreService genreService = new GenreServiceImpl();
    private FilmService filmService = new FilmServiceImpl();
            
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // Envoyer la liste des genres comme attribut de requête
        req.setAttribute("genresList", genreService.listerGenres()); // Ce qu'on avait fait en 2 lignes dans FilmsServlet
        
        // FORWARD
        req.getRequestDispatcher("ajouter_film.jsp").forward(req, resp);
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        // 1. Remplis un nouveau film en mémoire
        Film f = new Film(); // On crée une entité qui la balance au service, qui la balance au DAO, qui la balance en BDD
        
        // Je récupère du formulaire et je set mon objet Film
        f.setTitre(req.getParameter("titre"));
        f.setSynopsis(req.getParameter("synopsis"));
        
        long genreId = Long.parseLong(req.getParameter("genreId"));
        
        Genre g = new Genre();
        g.setId(genreId);
        
        g.getFilmList().add(f); // getFilmList vaut null, ce qui provoque une erreur. 
        // Dans Genre.java on remplace : private List<Film> filmList; par :
        // private List<Film> filmList = new ArrayList<>();
        // ce que NetBeans n'avait pas fait lors du Reverse Engenering de NetBeans
        
        f.setGenre(g);
        
        // 2. Ajouter
        filmService.ajouterFilm(f);
        
        // 3. Renvoie vers liste_films
        resp.sendRedirect("films"); // fais-moi un GET vers lister_films (éviter le problème du POST, sinon il faut créer le doPOST qui rediriger vers le doGET)
        // url-pattern venue de ListerFilmsServlet.java
        
    }

    
    
}
