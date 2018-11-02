/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9.core;

/**
 *
 * @author Carlos Cisneros
 */
public class Empleado extends Persona{
    
    private int claveEmpleado;
    
    public Empleado(String nombre,String apellidos, int edad, int clave){
        super(nombre,apellidos,edad);
        this.claveEmpleado=claveEmpleado;
        
    }
    
    public void setClave(int clave){
        this.claveEmpleado=claveEmpleado;
    }
    
     public int getclaveEmpleado(){
        return claveEmpleado;
    }
     
    public String Informacion() {
         return "\n\n\nEmpleado\n" + "Nombre: " + this.getNombre() + "\nApellido: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nClave: " + this.getclaveEmpleado();
    }
}
