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
public class Materia {
    String claveA;
    String claveM;

    public Materia(String claveA, String claveM) {
        this.claveA = claveA;
        this.claveM = claveM;
    }

    public String getClaveA() {
        return claveA;
    }

    public String getClaveM() {
        return claveM;
    }

    public void setClaveA(String claveA) {
        this.claveA = claveA;
    }

    public void setClaveM(String claveM) {
        this.claveM = claveM;
    }
    
    
}
