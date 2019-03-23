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
public class Teclado extends Parte {
    String material;
    String color;

    public Teclado(String material, String color, int tiempo_ensablaje) {
        super(tiempo_ensablaje);
        this.material = material;
        this.color = color;
    }

    public Teclado() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "material=" + material + ", color=" + color + '}';
    }
    
    
    
}
