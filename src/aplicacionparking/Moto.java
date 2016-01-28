/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

/**
 *
 * @author borja
 */
public class Moto extends Vehiculo {
    private int numRuedas;

    public Moto() {
    }

    public Moto(int numRuedas, String matricula, String nifDueño) {
        super(matricula, nifDueño);
        this.numRuedas = numRuedas;
    }
    
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return super.toString() + " numero de ruedas: "+numRuedas; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
