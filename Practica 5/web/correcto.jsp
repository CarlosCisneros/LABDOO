<%-- 
    Document   : correcto
    Created on : Created on : 11/10/2018, 08:35:12 PM
    Author     : Carlos Cisneros
--%>
<%@page import="Modelo.User"%>
<%
    if (session.getAttribute("username") != null) {
        response.sendRedirect("correcto.jsp");
    }
    User user = new User("username", "password");
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>

        <h1>Bienvenido <% out.print(user.getFullName());%></h1>
        <form action="profileController.do" method="post"> 
            
        </form>
        <br>        
        <br>

        <a href="logoutController.do">Cerrar sesión</a>

    </body>
</html>
