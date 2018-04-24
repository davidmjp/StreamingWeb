<%-- 
    Document   : details_serie
    Created on : 19 avr. 2018, 14:13:14
    Author     : Formation
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
            <h1>${serie.titre}</h1>
            
            
            Genre : ${serie.genre.nom}<br>
            
            Pays : <c:forEach items="${serie.paysList}" var="paysActuel">
                ${paysActuel.nom}
            </c:forEach>
            <br>
            Saison : <c:forEach items="${serie.saisonList}" var="saisonActuelle">
                ${saisonActuelle.numsaison},
                <c:forEach items="${saisonActuelle.episodeList}" var="ep">
                    ${ep.id}
                </c:forEach>
            </c:forEach>
            <br>
            Acteurs : <c:forEach items="${serie.personneList1}" var="acteurActuel">
                ${acteurActuel.prenom}
                ${acteurActuel.nom},
            </c:forEach>
            <br>
            Realisateurs : <c:forEach items="${serie.personneList}" var="realisateurActuel">
                ${realisateurActuel.prenom}
                ${realisateurActuel.nom},
            </c:forEach>
                
            <br><br>Synopsis : ${serie.synopsis}
            
            <br><br>
            <a href="films"><button>Retour</button></a>
        </main>
        <c:import url="_PIED.jsp"/>        
    </body>
</html>