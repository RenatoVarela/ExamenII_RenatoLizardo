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
public class OrdenEnsablaje {
    Computadora computadora;
   Tecnicos tecnico;

    public OrdenEnsablaje() {
    }

    public OrdenEnsablaje(Computadora computadora, Tecnicos tecnico) {
        this.computadora = computadora;
        this.tecnico = tecnico;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Tecnicos getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnicos tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "OrdenEnsablaje{" + "computadora=" + computadora + ", tecnico=" + tecnico + '}';
    }
   
   
    
    
}
