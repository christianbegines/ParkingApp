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

    int numPlaza;
    int sotano;
    char tipo;
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
      public int precio(Vehiculo v) {
        int precioFinal = 0;
        Coche c;
        Moto m;
        if (v instanceof Coche) {
            c = (Coche) v;
            if(c.tipo.equalsIgnoreCase("Largo")){
                precioFinal = 55;
            }else{
                precioFinal = 40;
            }
        }
        if (v instanceof Moto) {
            m = (Moto) v;            
            precioFinal = 25;
        }        
        if (this.sotano == 2){
            precioFinal = precioFinal - 5;
        }
        return precioFinal;
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
