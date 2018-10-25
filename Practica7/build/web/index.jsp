<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta content="text/html; charset=UTF-8">
      <title>Practica 7</title>
   </head>
   <body>
   
       <h1>Iniciar Sesion</h1>
       <form action="http://localhost:8080/Practica7/PROCESO" method="POST">
           
                        <p>Usuario</p><br>
                        <input type="text" name="usuario"/>             
                        <p>Password</p><br>
                        <input type="password" name="contrasena"/><br>
                       <input type="submit" name="ENTRAR" value="Enviar Datos "/>
                       <input type="reset" name="limpiar" value="Reiniciar Datos " />
                   
       </form>
   
   </body>
</html>
