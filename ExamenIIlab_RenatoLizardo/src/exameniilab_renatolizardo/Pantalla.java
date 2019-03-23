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
public class Pantalla extends Parte {
    
    String tactil;
    String Tipo;

    public Pantalla(String tactil, String Tipo, int tiempo_ensablaje) {
        super(tiempo_ensablaje);
        this.tactil = tactil;
        this.Tipo = Tipo;
    }

    public Pantalla() {
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return  "Tipo=" + Tipo +  ", tactil=" + tactil +'}';
    }
    
    
    
}
