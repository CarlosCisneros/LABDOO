/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.InputMismatchException;
import laboratorio9.core.Empleado;
import laboratorio9.core.Log;
import laboratorio9.core.Jefe;
import laboratorio9.core.Persona;


public class Practica9 {

   
    public static void main(String[] args) {
        
       Log log = Log.getInstance("C:\\Users\\Carlos\\Desktop\\lab2-log.txt");
       
        try{
           
            log.write("INICIO");
            
             ArrayList<Persona> personas = new ArrayList();
             Scanner sc = new Scanner(System.in);
        
             String nombreM,nombreA,apellidoM,apellidoA,clave;
             int edadM,edadA,claveEmpleado;
             
             
             
             log.write("Captura de información");
             
             System.out.println("Nombre del Jefe:");
                nombreM=sc.nextLine();
             System.out.println("Apellido del Jefe:");
                apellidoM=sc.nextLine();
             System.out.println("Clave del Jefe:");   
                clave=sc.nextLine();
             System.out.println("Edad del Jefe:");      
                edadM=sc.nextInt();
               
        sc.nextLine();
        
             System.out.println("Nombre del empleado");
                nombreA=sc.nextLine();
               
             System.out.println("Apellido del empleado:");
                apellidoA=sc.nextLine();
             System.out.println("Clave del empleado:");   
                claveEmpleado=sc.nextInt();
             System.out.println("Edad del empleado:");      
                edadA=sc.nextInt();        
                
            
            log.write("Construcción de objetos y listas de elementos");
            
             Persona maestro = new Jefe(nombreM, apellidoM, edadM, clave);
             Persona alumno = new Empleado(nombreA, apellidoA, edadA, claveEmpleado);
             Persona jefe = null;
             Persona empleado = null;
        
             personas.add(jefe);
             personas.add(empleado);
        
            log.write("Impresión de la informacion");
            
            personas.forEach((persona) -> {
                System.out.println(persona.Informacion());
           });
        }
        catch(InputMismatchException e){ 
        log.write("Datos Invalidos");
        }
        
        log.write("FIN");
        
        
    }
        
}