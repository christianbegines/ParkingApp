/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

import java.util.*;

/**
 *
 * @author borja
 */
public class Parking {

    String nombreParking, direccion;
    Map<String, Plaza> listaPlazas = new HashMap<>(); // Cambiar la clave por SNN ,s el numero de sotano y nn el numero de plaza.

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        Plaza p1 = new Plaza(1, 1);
        Plaza p2 = new Plaza(2, 1);
        Plaza p3 = new Plaza(3, 1);
        Plaza p4 = new Plaza(4, 1);
        Plaza p5 = new Plaza(5, 2);
        Plaza p6 = new Plaza(6, 2);
        Plaza p7 = new Plaza(7, 2);
        Plaza p8 = new Plaza(8, 2);
        p1.setTipo('C');
        p2.setTipo('C');
        p3.setTipo('C');
        p4.setTipo('C');
        p5.setTipo('C');
        p6.setTipo('M');
        p7.setTipo('M');
        p8.setTipo('M');
        listaPlazas.put(p1.SNN(), p1);
        listaPlazas.put(p2.SNN(), p2);
        listaPlazas.put(p3.SNN(), p3);
        listaPlazas.put(p4.SNN(), p4);
        listaPlazas.put(p5.SNN(), p5);
        listaPlazas.put(p6.SNN(), p6);
        listaPlazas.put(p7.SNN(), p7);
        listaPlazas.put(p8.SNN(), p8);
    }

    public String alquilar(Vehiculo v) {
        Iterator<String> it = listaPlazas.keySet().iterator();
        boolean comprobar = false;
        String numPlaza, resp = null;
        Plaza plaza;
        while (it.hasNext() && comprobar == false) {
            numPlaza = it.next();
            plaza = listaPlazas.get(numPlaza);
            if (plaza.getTipo() == 'M' && v instanceof Moto) {
                if (plaza.getVehiculo() == null) {
                    comprobar = true;
                    resp = plaza.SNN();
                    plaza.setVehiculo(v);
                }
            }
            if (plaza.getTipo() == 'C' && v instanceof Coche) {
                if (plaza.getVehiculo() == null) {
                    comprobar = true;
                    resp = plaza.SNN();
                    plaza.setVehiculo(v);
                }
            }

        }
        return resp;
    }

    public int darBaja(String snn) {
        int resultado;
        if (listaPlazas.containsKey(snn)) {
            if (listaPlazas.get(snn).getVehiculo() == null) {
                resultado = 2;

            } else {
                listaPlazas.put(snn, null);
                resultado = 0;
            }
        } else {
            resultado = 1;
        }
        return resultado;
    }

}
