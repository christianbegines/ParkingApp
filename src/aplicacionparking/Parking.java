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
    Map<String,Plaza> listaPlazas = new HashMap<>(); // Cambiar la clave por SNN ,s el numero de sotano y nn el numero de plaza.

    public Parking(String nombreParking) {
        this.nombreParking = nombreParking;
        
    }
    public String alquilar(Vehiculo v){
        Iterator<String> it =listaPlazas.keySet().iterator();
        boolean comprobar=false;
        String clave,resp="";
        Plaza p;
        while( it.hasNext()) {
            clave = it.next();
             p = listaPlazas.get(clave);
            if(p.getVehiculo()==null){
                resp=p.SNN();
            }else resp=null;
        }return resp;
    }
    
}
