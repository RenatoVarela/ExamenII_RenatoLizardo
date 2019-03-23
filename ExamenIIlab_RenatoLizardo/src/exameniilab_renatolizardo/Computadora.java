/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameniilab_renatolizardo;

import java.util.Date;

/**
 *
 * @author Asus Pc
 */
public class Computadora {
    String num_serie;
    String fecha;
    String color;
    String material;
    RAM ram;
    DiscoDuro disco_duro;
    bateria bateria;
    Teclado teclado;
    Pantalla pantalla;
    Procesador procesador;

    public Computadora() {
    }

    public Computadora(String num_serie, String fecha, String color, String material, RAM ram, DiscoDuro disco_duro, bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.num_serie = num_serie;
        this.fecha = fecha;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco_duro = disco_duro;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public Computadora(String num_serie, String fecha, String color, String material) {
        this.num_serie = num_serie;
        this.fecha = fecha;
        this.color = color;
        this.material = material;
    }
    
    

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public DiscoDuro getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(DiscoDuro disco_duro) {
        this.disco_duro = disco_duro;
    }

    public bateria getBateria() {
        return bateria;
    }

    public void setBateria(bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "num_serie=" + num_serie /*+ ", fecha=" + fecha + ", color=" + color + ", material=" + material + ", ram=" + ram + ", disco_duro=" + disco_duro + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", procesador=" + procesador + '}'*/;
    }
    
    
    
    
    
    
    
}
