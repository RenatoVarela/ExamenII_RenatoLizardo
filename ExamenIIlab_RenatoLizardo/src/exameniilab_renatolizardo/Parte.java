/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameniilab_renatolizardo;

/**
 *
 * @author Asus Pc
 */
public class Parte {
    int tiempo_ensablaje;

    public Parte(int tiempo_ensablaje) {
        this.tiempo_ensablaje = tiempo_ensablaje;
    }

    public Parte() {
    }

    public int getTiempo_ensablaje() {
        return tiempo_ensablaje;
    }

    public void setTiempo_ensablaje(int tiempo_ensablaje) {
        this.tiempo_ensablaje = tiempo_ensablaje;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempo_ensablaje=" + tiempo_ensablaje + '}';
    }
    
    
    
    
}
