package edu.manuel.android.sueldopoo;

import java.io.Serializable;

/**
 * Created by postgres on 22/9/2017.
 */

public class empleado implements Serializable {
    private String nombre;
    private String cedula;
    private int horas;
    private double sueldo;

    public empleado(String nombre, String cedula, int horas, double sueldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horas = horas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double calculoSueldo() {
        int cal= horas;
        double resultado =0;

        if (horas>20) {
            resultado = horas*14;
        }
        else {
            resultado=0;
        }
        return resultado;
    }

    public empleado() {
    }
}
