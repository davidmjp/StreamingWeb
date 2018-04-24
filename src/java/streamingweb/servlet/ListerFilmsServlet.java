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
@WebServlet(name = "FilmsServlet", urlPatterns = {"/films"})
public class ListerFilmsServlet extends HttpServlet {
// super.doGet(req, resp); // On l'enlève parce que ça affiche une erreur
    
    private FilmService service = new FilmServiceImpl();
    
    @Override // alt+insert Override Method, doGet
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    // 1. Récupérer la liste des films grâces au FilmsService
    List<Film> films = service.listerFilms();
    
    // 2. Envoyer la liste des films comme attribut de requête
    req.setAttribute("listeDesFilms", films);
    
    // 3. Forward vers films.jsp
    req.getRequestDispatcher("films.jsp").forward(req, resp);
    
    }
    
    

   
}
