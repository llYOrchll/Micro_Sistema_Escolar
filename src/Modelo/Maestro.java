/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Javier
 */
public class Maestro {
    String clave;
    String nombreMaestro;
    String apellidoMaestro;

    public Maestro(String clave, String nombreMaestro, String apellidoMaestro) {
        this.clave = clave;
        this.nombreMaestro = nombreMaestro;
        this.apellidoMaestro = apellidoMaestro;
    }

    public String getClave() {
        return clave;
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public String getApellidoMaestro() {
        return apellidoMaestro;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    public void setApellidoMaestro(String apellidoMaestro) {
        this.apellidoMaestro = apellidoMaestro;
    }
    
    
    
}
