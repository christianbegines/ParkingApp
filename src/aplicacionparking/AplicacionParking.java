/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

import java.time.LocalDate;
import java.util.*;

/**
 * 2
 *
 * @author daw1
 */
public class AplicacionParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        Parking park = new Parking("PARKING DEVELOPER");
        boolean salir = true;
        int casos, resultado;
        String matricula, nifDueño, tipoCoche, SNN, respuesta = "", respuesta1 = "";
        char tipoVehiculo;
        List<Plaza> listaC;
        List<Plaza> listaM;
        Vehiculo v;
        LocalDate hoy = LocalDate.now();
        boolean resp = false;

        System.out.println("------|Bienvenido a parking developers|---------");
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.println("");
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("              -|MENU|-                          ");
            System.out.println("----------1.Alquilar un vehiculo----------------");
            System.out.println("----------2.Dar de baja un vehiculo-------------");
            System.out.println("----------3.Conocer ganancias del parking-------");
            System.out.println("----------4.salir-------------------------------");
            casos = sc.nextInt();
            switch (casos) {
                case 1: {
                    try {
                        System.out.println("Vamos a alquilar su vehiculo,introduzcamos datos.");

                        System.out.println("Introduce Matricula");
                        matricula = st.next();

                        do {

                            System.out.println("Introduce tu nif");
                            nifDueño = st.next();
                            if (nifDueño.length() == 9) {
                                resp = true;
                            } else {
                                System.out.println("Nif incorrecto");
                            }
                        } while (resp == false);
                        System.out.println("Introduce el tipo, C o M");
                        tipoVehiculo = st.next().toUpperCase().charAt(0);

                        if (tipoVehiculo == 'C') {
                            System.out.println("Que es : Largo o Corto?");
                            tipoCoche = st.next();

                            v = new Coche(tipoCoche, matricula, nifDueño);

                            System.out.println("Tu plaza es:" + park.alquilar(v));

                        } else {
                            if (tipoVehiculo == 'M') {

                                v = new Moto(2, matricula, nifDueño);

                                System.out.println("Tu plaza es: " + park.alquilar(v));
                            } else {
                                System.out.println("Tipo incorrecto");
                            }
                        }

                    } catch (ErrorMatricula e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
                case 2: {
                    System.out.println("Vamos a dar de baja tu vehiculo");
                    System.out.println("Introduce el sotano y la plaza donde esta tu vehiculo en formato SNN");
                    SNN = st.next();
                    resultado = park.darBaja(SNN);
                    if (resultado == 0) {
                        System.out.println("Tu alquier a sido dado de baja, gracias por su atencion");
                    }
                    if (resultado == 1) {
                        System.out.println("No existe la plaza buscada");
                    }
                    if (resultado == 2) {
                        System.out.println("La plaza no esta ocupada");
                    }

                }
                break;
                case 3: {
                    System.out.println("Las ganancias del parking son :" + park.ganancias());
                }
                break;
                case 4: {
                    System.out.println("Lista de plazas de coches libres al final del dia " + hoy);
                    listaC = park.listarPlazas("Libres", 'C');
                    for (Plaza plaza : listaC) {
                        respuesta += "     Numero sotano: " + plaza.getSotano() + " Numero plaza: " + plaza.getNumPlaza() + "\n";
                    }
                    System.out.println(respuesta);
                    System.out.println("Lista de plazas de Motos libres al final del dia " + hoy);
                    listaM = park.listarPlazas("Libres", 'M');
                    for (Plaza plaza : listaM) {
                        respuesta1 += "    Numero sotano: " + plaza.getSotano() + " Numero plaza: " + plaza.getNumPlaza() + "\n";
                    }
                    System.out.println(respuesta1);
                    System.out.println("Hasta pronto!");
                    salir = false;
                }

            }

        } while (salir == true);

    }

}
