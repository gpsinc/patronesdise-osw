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
public class Control {
    public static String aparatoID;

    public String getAparatoID() {
        return aparatoID;
    }

    public void setAparatoID(String aparatoID) {
        this.aparatoID = aparatoID;
    }    
    
    
    public void enviarSeñal(boolean accion) {
        String aparato = this.getAparatoID();
        if(aparato == "tv") {
            Television tv = new Television();
            tv.setEstadoTv(accion);
            tv.recibirSeñal();
            
        } else if(aparato == "stereo") {
            Stereo st = new Stereo();
            st.setEstadoSte(accion);
            st.recibirSeñal();
            
        } else if(aparato == "dvd") {
            dvd dv = new dvd();
            dv.setEstadoDvd(accion);
            dv.recibirSeñal();
        } else {
        System.out.println("ÑOOOO");
        }
    }
}
