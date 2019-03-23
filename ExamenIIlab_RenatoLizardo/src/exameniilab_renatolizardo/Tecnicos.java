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
public class Tecnicos {
    String nombre;
    int edad;
    String genero;
    int computadoras_ensabladas;

    public Tecnicos() {
    }

    public Tecnicos(String nombre, int edad, String genero, int computadoras_ensabladas) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.computadoras_ensabladas = computadoras_ensabladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getComputadoras_ensabladas() {
        return computadoras_ensabladas;
    }

    public void setComputadoras_ensabladas(int computadoras_ensabladas) {
        this.computadoras_ensabladas = computadoras_ensabladas;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + "nombre=" + nombre /*+ ", edad=" + edad + ", genero=" + genero + ", computadoras_ensabladas=" + computadoras_ensabladas + '}'*/;
    }
    
    
    
}
