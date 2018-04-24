<%-- 
    Document   : ajouter_film
    Created on : 20 avr. 2018, 09:20:22
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
            <br>
            <form method="post">
                <label>Titre : </label>
                <input name="titre" type="text"/>
                <br><br>
                <label>Synopsis : </label>
                <textarea name="synopsis"></textarea>
                <br><br>
                <label>Genre : </label>
                <select name="genreId">
                    <c:forEach items="${genresList}" var="genreActuel">
                        <option value="${genreActuel.id}">${genreActuel.nom}</option>
                    </c:forEach>
                </select>
                <input type="submit"/>
            </form>
        </main>
        <c:import url="_PIED.jsp"/>        
    </body>
</html>
