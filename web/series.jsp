<%-- 
    Document   : series
    Created on : 18 avr. 2018, 11:22:32
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
            <c:forEach items="${listeDesSeries}" var="serieActuelle">
                
                <br>
                ${serieActuelle.titre}
                
                <a href="details_serie?idSerie=${serieActuelle.id}"><button>Détails</button></a>
                
            </c:forEach>
        </main>
        <c:import url="_PIED.jsp"/>        
    </body>
</html>
