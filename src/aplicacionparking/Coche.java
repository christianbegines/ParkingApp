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
public class Coche extends Vehiculo {

    private String tipo;

    public Coche(String tipo) {
        this.tipo = tipo;
    }

    public Coche(String tipo, String matricula, String nifDueño) {
        super(matricula, nifDueño);
        String otro = "";
        if (tipo.equalsIgnoreCase("corto") || tipo.equalsIgnoreCase("largo")) {
            otro = tipo;
        }

        this.tipo = otro;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTip(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo: " + tipo; //To change body of generated methods, choose Tools | Templates.
    }

}
