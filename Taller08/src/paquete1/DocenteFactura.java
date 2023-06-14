/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente {

    private double valorF;
    private double iva;
    private double valorP;

    public void establecerValorF(double v) {
        valorF = v;
    }

    public void establecerIva() {
        iva = 12;
    }

    public void establecerValorPagar() {
        valorP = valorF - ((valorF * iva) / 100);
    }

    public double obtenerValorF() {
        return valorF;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorPagar() {
        return valorP;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Docente Factura\n");
        mensaje = String.format("%s Nombre:%s\nCedula: %s\nValor Factura: %.2f\n"
                + "Valor iva %.2f\n"
                + "Valor a pagar: %.2f\n",
                mensaje, nombre, cedula, valorF, iva, valorP);
        return mensaje;
    }
}
