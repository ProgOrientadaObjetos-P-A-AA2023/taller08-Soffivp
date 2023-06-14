/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente {

    private double sueldo;
    private double horaExtra;
    private int nhoras;
    private double sueldoT;

    public void establecerSueldo(double s) {
        sueldo = s;
    }

    public void establecerHoraExtra(double h) {
        horaExtra = h;
    }

    public void establecerNhoras(int nh) {
        nhoras = nh;
    }

    public void establecerSueldoT() {
        sueldoT = (sueldo + (horaExtra * nhoras));
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public double obtenerHoraExtra() {
        return horaExtra;
    }

    public int obtenerNhoras() {
        return nhoras;
    }

    public double obtenerSueldoT() {
        return sueldoT;
    }

    public String toString() {
        String mensaje = String.format("Docente con nombramiento\n");
        mensaje = String.format("%s Nombre:%s\nCedula: %s\nSueldo: %.2f\n"
                + "Numero de horas: %d\n"
                + "Valor hora extra %.2f\n"
                + "Sueldo a recibir: %.2f\n",
                mensaje, nombre, cedula, sueldo, nhoras, horaExtra, sueldoT);
        return mensaje;
    }

}
