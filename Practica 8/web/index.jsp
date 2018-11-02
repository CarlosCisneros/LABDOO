<%-- 
    Document   : index
    Created on : 30/10/2018, 09:56:17 PM
    Author     : Carlos Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="styles.css" rel="stylesheet" type="text/css"/>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 8</title>
    </head>
    <body>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <h1>Iniciar sesión</h1>
        
        <form action=" " method="post">
            
            
            <label>Nombre</label>
            <input type="text" name="usuario"/><br/>
            <label>Contraseña</label>
            <input type="password" name="contraseña"/><br/>
            <input type="submit" value="Iniiciar Sesión">
            
            
            
        </form>
        <br/>
        Registrate <a href="registro.jsp">Aquí</a>
        
    </body>
</html>
