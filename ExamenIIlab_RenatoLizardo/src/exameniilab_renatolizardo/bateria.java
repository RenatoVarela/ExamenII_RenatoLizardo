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
public class bateria extends Parte  {
    String capacidad_horas;
    String material;

    public bateria(String capacidad_horas, String material, int tiempo_ensablaje) {
        super(tiempo_ensablaje);
        this.capacidad_horas = capacidad_horas;
        this.material = material;
    }

    public bateria() {
    }

    public String getCapacidad_horas() {
        return capacidad_horas;
    }

    public void setCapacidad_horas(String capacidad_horas) {
        this.capacidad_horas = capacidad_horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "capacidad_horas=" + capacidad_horas + ", material=" + material + '}';
    }
    
    
    
}
