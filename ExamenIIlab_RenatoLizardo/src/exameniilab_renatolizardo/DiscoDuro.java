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
public class DiscoDuro extends Parte  {
    String tamano;
    String marca;

    public DiscoDuro(String tamano, String marca, int tiempo_ensablaje) {
        super(tiempo_ensablaje);
        this.tamano = tamano;
        this.marca = marca;
    }

    public DiscoDuro() {
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" + "tamano=" + tamano + ", marca=" + marca + '}';
    }
    
    
    
}
