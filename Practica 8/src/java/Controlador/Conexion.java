/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carlos Cisneros
 */
public class Conexion {
 
    private String USERNAME = "CarlosCns";
    private String PASSWORD = "123456";
    private String HOST = "localhost";
    private String PORT = "1527";
    private String DATABASE = "login";
    private String CLASSNAME = "java.sql.Driver";
    private String URL ="jdbc:derby://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    
    
    public Conexion() throws SQLException{
        try{
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            System.err.println("ERROR " + e);
            
        } 
    }
    
    public Connection getConexion(){
        return con;
        
    }
    
    public static void main(String[] args) throws SQLException{
        Conexion con;
        con = new Conexion();
        
    }
}