<%-- 
    Document   : details
    Created on : 18 avr. 2018, 11:50:22
    Author     : Formation



EXPLICATION : 
Le "film" que l'on retrouve ici dans les ${film.  } est défini dans DetailsFilmServlet.java dans : 
req.setAttribute("film", film);
il correspond à l'attribut "film" entre guillemets (qui est de type Film)


--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>StreamingWeb</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_ENTETE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <main>
            <h1>${film.titre}</h1>
            
            Année de production : ${film.annee}<br>
            Durée : ${film.duree} minutes <br>
            Genre : ${film.genre.nom}<br>
            
            Pays : <c:forEach items="${film.pays}" var="paysActuel">
                ${paysActuel.nom}
            </c:forEach>
            <br>
            Acteurs : <c:forEach items="${film.acteurs}" var="acteurActuel">
                ${acteurActuel.prenom}
                ${acteurActuel.nom},
            </c:forEach>
            <br>
            Realisateurs : <c:forEach items="${film.realisateurs}" var="realisateurActuel">
                ${realisateurActuel.prenom}
                ${realisateurActuel.nom},
            </c:forEach>
                
            <br><br>Synopsis : ${film.synopsis}
            
            <br><br>
            <a href="films"><button>Retour</button></a>
        </main>
        <c:import url="_PIED.jsp"/>        
    </body>
</html>