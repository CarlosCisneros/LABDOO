<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
     
      <title>LOGIN</title>
   </head>
   <body img src="fondoazul.jpg" alt=""/>
   <center>
       <h1>Iniciar sesión</h1>
       <form action="PROCESO" method="POST">
                <tr>
                    
                    <h3>Usuario: <input type="text" name="usuario"/></h3>
                   
             
                   
                    <h3>Contraseña: <input type="password" name="contrasena"/> </h3>
                    
                    <h1><input type="submit" name="ENTRAR" value="Entrar"/> </h1>
                    <br>
                    <em><h4><a href="registro.jsp">¿No tienes cuenta? registrate aqui.</a> </h4></em>
                  
       </form>
   </center>
   </body>
</html>