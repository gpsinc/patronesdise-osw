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
public class Television implements AparatoElectronico{
    
    public boolean estadoTv;
    
    public boolean getEstadoTv() {
        return estadoTv;
    }

    public void setEstadoTv(boolean estadoTv) {
        this.estadoTv = estadoTv;
    }
    
    
    @Override
    public void recibirSeñal() {
        String isThis = Control.aparatoID;
        
        if (isThis == "tv") {
            boolean estado = this.getEstadoTv();
            
            if (estado == false) {
                apagar();
            } else {
                encender();
            }
        }             
    }
    
    @Override
    public void apagar() {
        System.out.println("Se apago el televisor");
    }

    @Override
    public void encender() {
        System.out.println("Se encendio el televisor");
    }    
}
