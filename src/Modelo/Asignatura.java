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
public class Asignatura {
    String clave;
    String licenciatura;
    String nombreAsignatura;

    public Asignatura(String clave, String licenciatura, String nombreAsignatura) {
        this.clave = clave;
        this.licenciatura = licenciatura;
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getClave() {
        return clave;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    
    
}
