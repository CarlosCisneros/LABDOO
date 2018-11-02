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
public class Jefe extends Persona{

    private String claveEmpleado;
    
    public Jefe(String nombre,String apellidos,int edad,String claveEmpleado){
        super(nombre,apellidos,edad);
        this.claveEmpleado=claveEmpleado;
    }
    
    public void setClaveEmpleado(String claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }

    public String getClaveEmpleado(){
        return claveEmpleado;
    }
    
    /**
     *
     * @return
     */
    @Override
   public String Informacion() {
     return "\n\nJefe\n" +"Nombre: " + this.getNombre() + "\nApellido: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nClave del Empleado: " + this.getClaveEmpleado();
    }
}