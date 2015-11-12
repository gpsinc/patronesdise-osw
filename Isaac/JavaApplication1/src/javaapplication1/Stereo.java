/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Isaac
 */
public class Stereo implements AparatoElectronico{
    
    public boolean estadoSte;

    public boolean getEstadoSte() {
        return estadoSte;
    }

    public void setEstadoSte(boolean estadoSte) {
        this.estadoSte = estadoSte;
    }
    

    @Override
    public void recibirSeñal() {
        String isThis = Control.aparatoID;
            
        if (isThis == "stereo") {
            boolean estado = this.getEstadoSte();
            
            if (estado == false) {
                apagar();
            } else {
                encender();
            }
        }             
    }
    
    @Override
    public void apagar() {
        System.out.println("Se apago el stereo");
    }

    @Override
    public void encender() {
        System.out.println("Se encendio el stereo");
    }  

    
}
