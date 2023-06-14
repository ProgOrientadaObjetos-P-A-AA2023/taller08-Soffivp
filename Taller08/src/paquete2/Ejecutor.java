/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        DocenteNombramiento dn = new DocenteNombramiento();
        DocenteFactura df = new DocenteFactura();
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        int opc = 0;
        while (bandera) {
            System.out.println("Ingrese el nombre del docente");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la cedula del docente");
            String cedula = entrada.nextLine();
            // entrada.nextLine();
            System.out.println("Ingrese 1 para crear un docente nombramiento.\n"
                    + "2 para crear un docente factura. ");
            opc = entrada.nextInt();
            if (opc == 1) {

                System.out.println("Ingrese el sueldo ");
                double sueldo = entrada.nextDouble();
                System.out.println("Ingrese el numero de horas extras trabajadas");
                int horas = entrada.nextInt();
                System.out.println("Ingrese el valor de las horas extras");
                double valor = entrada.nextDouble();

                dn.establecerNombre(nombre);
                dn.establecerCedula(cedula);
                dn.establecerSueldo(sueldo);
                dn.establecerNhoras(horas);
                dn.establecerHoraExtra(valor);
                dn.establecerSueldoT();
                System.out.println(dn);
            } else if (opc == 2) {

                System.out.println("Ingrese el valor a pagar");
                double valorf = entrada.nextDouble();
                df.establecerNombre(nombre);
                df.establecerCedula(cedula);
                df.establecerValorF(valorf);
                df.establecerIva();
                df.establecerValorPagar();
                System.out.println(df);

            } else {
                System.out.println("Opcion incorrecta");
            }
            entrada.nextLine();
            System.out.println("Desea salir del proceso. Ingrese:  si");
            String salida = entrada.nextLine();
            salida.toLowerCase();
            if (salida.equals(
                    "si")) {
                bandera = false;
            }
        }

    }
}
