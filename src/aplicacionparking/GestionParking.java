/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

import java.util.Scanner;

/**
 *
 * @author borja
 */
public class GestionParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        int menu;
        System.out.println("BIENVENIDO AL SISTEMA DE GESTION DE PARKING");

        do {
            System.out.println("1.Alquilar plazas");
            System.out.println("2.Abandonar alquiler");
            System.out.println("3.Dinero ganado");
            System.out.println("4.Cierre diario");
            menu = opcion.nextInt();

            switch (menu) {
                case 1:
                    //alquilar vehiculo
                    break;
            }

        } while (menu != 4);

    }

}
