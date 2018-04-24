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
import streamingweb.entity.Serie;
import streamingweb.service.SerieService;
import streamingweb.service.SerieServiceImpl;

/**
 *
 * @author Formation
 */
@WebServlet(name = "DetailsSerieServlet", urlPatterns = {"/details_serie"})
public class DetailsSerieServlet extends HttpServlet {
    
    private SerieService service = new SerieServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        long idSerie = Long.parseLong( req.getParameter("id") );
        
        Serie serie = service.rechercheParId (idSerie);
        
        long nbTotalEp = service.compterNbEpisodes(idSerie);
        
        req.setAttribute("serie", serie);
        
        req.setAttribute("nbEpisodes", nbTotalEp);
        
        req.getRequestDispatcher("details_serie.jsp").forward(req, resp);
        
    }

   
}
