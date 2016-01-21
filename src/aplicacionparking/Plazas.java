/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

/**
 *
 * @author chavo
 */
public class Plazas {

    int numPlaza;
    int sotano;
    char tipo;
    Vehiculo vehiculo;

    public Plazas(int numPlaza, int sotano) {
        this.numPlaza = numPlaza;
        this.sotano = sotano;
    }

    public int getNumPlaza() {
        return numPlaza;
    }

    public void setNumPlaza(int numPlaza) {
        this.numPlaza = numPlaza;
    }

    public int getSotano() {
        return sotano;
    }

    public void setSotano(int sotano) {
        this.sotano = sotano;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        String resp;
        if (this.vehiculo == null) {
            resp = "NºPlaza:" + this.numPlaza + " " + "Sotano:" + this.sotano;
        } else {
            resp = "NºPlaza:" + this.numPlaza + " " + "Sotano:" + this.sotano + "\n"
                    + "Vehiculo:" + vehiculo.toString() + "\n" + "Precio:";
        }

        return resp;

    }

}
