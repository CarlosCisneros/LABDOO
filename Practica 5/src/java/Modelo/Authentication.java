/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Carlos Cisneros
 */
public class Authentication {
      
    public static boolean Authenticate(String username, String password){
        
        String userDataBase="Carlos";
        String passwordDataBase="123456";
        
        return username.equals(userDataBase) && password.equals(passwordDataBase);
    }  
}
