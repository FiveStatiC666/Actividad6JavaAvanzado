<%-- 
    Document   : index
    Created on : 16 feb 2023, 21:03:08
    Author     : crome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.paso" %>
<%@taglib prefix="mistags" uri="/WEB-INF/tlds/misTags"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>  
        
        <mistags:cuerpo>Edgar, ejemplo de tag con cuerpo</mistags:cuerpo>
        <br>
        <mistags:prueba/>
        
        <h1>Actividad 6</h1>
        <form action="paso" method="post">
              Base: <br>
              <input type="text" name="base" value=""><br>
              Altura: <br>
              <input type="text" name="altura" value="" ><br><br>
              <input type="submit" value="Calcular">
        </form>
    </body>
</html>