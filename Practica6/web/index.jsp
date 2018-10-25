<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
      <meta content="text/html; charset=UTF-8">
      <title>Práctica 6</title>
   
   <body>
       <link rel="stylesheet" type="text/css" href="styles.css" />
   
       <h1>Inicia Sesion</h1>
       <form action="proceso" method="post">
           
                        <p>Usuario</p><br>
                        <input type="text" name="usuario"/>             
                        <p>Password</p><br>
                        <input type="password" name="contraseña"/><br>
                       <input type="submit" name="ENTRAR" value="Enviar"/>
                       <input type="reset" name="limpiar" value="Limpiar " />
                   
       </form>
   
   </body>
</html>
