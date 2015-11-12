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
public class dvd implements AparatoElectronico{
    
    public boolean estadoDvd;

    public boolean getEstadoDvd() {
        return estadoDvd;
    }

    public void setEstadoDvd(boolean estadoDvd) {
        this.estadoDvd = estadoDvd;
    }
    

    @Override
    public void recibirSeñal() {
        String isThis = Control.aparatoID;
            
        if (isThis == "dvd") {
            boolean estado = this.getEstadoDvd();
            
            if (estado == false) {
                apagar();
            } else {
                encender();
            }
        }             
    }
    
    @Override
    public void apagar() {
        System.out.println("Se apago el dvd");
    }

    @Override
    public void encender() {
        System.out.println("Se encendio el dvd");
    }  

    
}
