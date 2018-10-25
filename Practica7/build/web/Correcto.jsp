<%@page import="MODELO.USUARIO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
USUARIO us = (USUARIO)request.getSession().getAttribute("USUARIO1");
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>Bienvenido <%=us.getUsuario()%> !</h1>
        <p> Contraseña :<%= us.getContrasena()%> </p>  
        <p>cookie creada</p>
      <a href="dargalleta"> Presiona aqui</a>
    </body>
</html>
