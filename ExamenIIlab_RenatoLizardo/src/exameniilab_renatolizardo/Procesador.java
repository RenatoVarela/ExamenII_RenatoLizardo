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
public class Procesador extends Parte {
    int num_nucleos;
    int velocidad;

    public Procesador(int num_nucleos, int velocidad, int tiempo_ensablaje) {
        super(tiempo_ensablaje);
        this.num_nucleos = num_nucleos;
        this.velocidad = velocidad;
    }

    public Procesador() {
    }

    public int getNum_nucleos() {
        return num_nucleos;
    }

    public void setNum_nucleos(int num_nucleos) {
        this.num_nucleos = num_nucleos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "num_nucleos=" + num_nucleos + ", velocidad=" + velocidad + '}';
    }
    
    
    
}
