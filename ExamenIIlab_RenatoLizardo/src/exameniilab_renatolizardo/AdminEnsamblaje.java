/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameniilab_renatolizardo;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus Pc
 */
public class AdminEnsamblaje extends Thread {

    private JProgressBar p;
    private Computadora ensamblaje;
    private JTable t;
    boolean vive;
    boolean avanzar;
    int tiempo = 600;

    public AdminEnsamblaje(JProgressBar p, Computadora ensamblaje, JTable t) {
        this.t = t;
        this.p = p;
        this.ensamblaje = ensamblaje;
        vive = true;
        avanzar = true;

        //num = r.nextInt(3);
    }

    public JProgressBar getP() {
        return p;
    }

    public void setP(JProgressBar p) {
        this.p = p;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {

        int filas = 0;

        DefaultTableModel tablemodel;

        tablemodel = (DefaultTableModel) t.getModel();
        tablemodel.addRow(new Object[filas]);

        int timepo;
        int timepototal;

        timepototal = ensamblaje.getRam().getTiempo_ensablaje() + ensamblaje.getBateria().getTiempo_ensablaje() + ensamblaje.getDisco_duro().getTiempo_ensablaje()
                + ensamblaje.getProcesador().getTiempo_ensablaje() + ensamblaje.getTeclado().getTiempo_ensablaje() + ensamblaje.getPantalla().getTiempo_ensablaje();

        // p.setMaximum(timepototal);
        for (int i = 0; i < 6; i++) {
            if (i == 0) {

                while (p.getValue() <= ensamblaje.getRam().getTiempo_ensablaje()) {

                    p.setValue(p.getValue() + 1);
                    p.setString("Ensamblado la ram: " + Integer.toString(p.getValue()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                tablemodel = (DefaultTableModel) t.getModel();
                tablemodel.addRow(new Object[filas]);

                for (int j = 0; j < t.getColumnCount() - 1; j++) {
                    tablemodel.setValueAt("Ram", filas, 0);
                    tablemodel.setValueAt(ensamblaje.getRam().getTiempo_ensablaje(), filas, 1);
                }

                filas++;

                p.setValue(0);

            } else if (i == 1) {

                while (p.getValue() <= ensamblaje.getDisco_duro().getTiempo_ensablaje()) {

                    p.setValue(p.getValue() + 1);
                    p.setString("Ensamblado El disco Duro: " + Integer.toString(p.getValue()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                tablemodel = (DefaultTableModel) t.getModel();
                tablemodel.addRow(new Object[filas]);

                for (int j = 0; j < t.getColumnCount() - 1; j++) {
                    tablemodel.setValueAt("Disco Duro", filas, 0);
                    tablemodel.setValueAt(ensamblaje.getDisco_duro().getTiempo_ensablaje(), filas, 1);
                }

                filas++;

                p.setValue(0);

            } else if (i == 2) {

                while (p.getValue() <= ensamblaje.getBateria().getTiempo_ensablaje()) {

                    p.setValue(p.getValue() + 1);
                    p.setString("Ensamblado la Bateria: " + Integer.toString(p.getValue()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                tablemodel = (DefaultTableModel) t.getModel();
                tablemodel.addRow(new Object[filas]);

                for (int j = 0; j < t.getColumnCount() - 1; j++) {
                    tablemodel.setValueAt("Bateria", filas, 0);
                    tablemodel.setValueAt(ensamblaje.getBateria().getTiempo_ensablaje(), filas, 1);
                }

                filas++;

                p.setValue(0);

            } else if (i == 3) {
                //p.setMaximum(ensamblaje.getTeclado().getTiempo_ensablaje());

                while (p.getValue() <= ensamblaje.getTeclado().getTiempo_ensablaje()) {

                    p.setValue(p.getValue() + 1);
                    p.setString("Ensamblado el teclado: " + Integer.toString(p.getValue()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                tablemodel = (DefaultTableModel) t.getModel();
                tablemodel.addRow(new Object[filas]);

                for (int j = 0; j < t.getColumnCount() - 1; j++) {
                    tablemodel.setValueAt("TECLAS", filas, 0);
                    tablemodel.setValueAt(ensamblaje.getTeclado().getTiempo_ensablaje(), filas, 1);
                }

                filas++;

                p.setValue(0);

            } else if (i == 4) {

                while (p.getValue() <= ensamblaje.getPantalla().getTiempo_ensablaje()) {

                    p.setValue(p.getValue() + 1);
                    p.setString("Ensamblado la pantalla: " + Integer.toString(p.getValue()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                tablemodel = (DefaultTableModel) t.getModel();
                tablemodel.addRow(new Object[filas]);

                for (int j = 0; j < t.getColumnCount() - 1; j++) {
                    tablemodel.setValueAt("Pantalla", filas, 0);
                    tablemodel.setValueAt(ensamblaje.getBateria().getTiempo_ensablaje(), filas, 1);
                }

                filas++;

                p.setValue(0);

            } else if (i == 5) {

                while (p.getValue() <= ensamblaje.getProcesador().getTiempo_ensablaje()) {

                    p.setValue(p.getValue() + 1);
                    p.setString("Ensamblado la procesador: " + Integer.toString(p.getValue()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                }

                tablemodel = (DefaultTableModel) t.getModel();
                tablemodel.addRow(new Object[filas]);

                for (int j = 0; j < t.getColumnCount() - 1; j++) {
                    tablemodel.setValueAt("procesador", filas, 0);
                    tablemodel.setValueAt(ensamblaje.getProcesador().getTiempo_ensablaje(), filas, 1);
                }

                filas++;
                p.setValue(0);

            }
                          
        }

        /*
        
        
         */
    }

}
