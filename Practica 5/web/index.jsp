<%-- 
    Document   : index
    Created on : 12/10/2018, 08:06:33 PM
    Author     : Carlos Cisneros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 5</title>
    </head>
    <body>
    <form action="controlador.do" method="get">
    
        <h1>Iniciar sesión</h1><br>
    <br><label id="User" for="user">Usuario</label>
    <br><input type="text" name ="user"><br>
    <br><label id="Password" for = "password">Password</label>
    <br><input type="password" name="password"><br>

    <br><input type="submit" value="Enviar"><br>


    </body>
</html>
