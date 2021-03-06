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
public class Plaza {

    private int numPlaza;
    private int sotano;
    private char tipo;
    Vehiculo vehiculo;

    public Plaza(int numPlaza, int sotano) {
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

    public String SNN() {
        String resp;
        resp = "" + this.sotano + this.numPlaza + "";
        return resp;

    }

    public int precio() {
        int precioFinal = 0;
        Coche c;
        if (vehiculo instanceof Coche) {
            c = (Coche) vehiculo;
            if (c.getTipo().equalsIgnoreCase("Largo")) {
                precioFinal = 55;
            } else {
                precioFinal = 40;
            }
        }
        if (vehiculo instanceof Moto) {
            precioFinal = 25;
        }
        if (this.sotano == 2) {
            precioFinal = precioFinal - 5;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        String resp;
        if (this.vehiculo == null) {
            resp = "Sotano:" + this.sotano + " " + "NºPlaza:" + this.numPlaza + "\n";
        } else {
            resp = "NºPlaza:" + this.numPlaza + " " + "Sotano:" + this.sotano + "\n"
                    + "Vehiculo:" + vehiculo.toString() + "\n" + "Precio:" + precio();
        }

        return resp;

    }

}
