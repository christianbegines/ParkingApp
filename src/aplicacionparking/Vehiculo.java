/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

/**
 *
 * @author daw1
 */
public  class Vehiculo {
    String matricula;
    String modelo;
    String color;
    String nifDueño;
    String telefono;

    public Vehiculo() {
    }

    
    public Vehiculo(String matricula, String nifDueño) {
        this.matricula = matricula;
        this.nifDueño = nifDueño;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNifDueño() {
        return nifDueño;
    }

    public void setNifDueño(String nifDueño) {
        this.nifDueño = nifDueño;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) { //falta añadir 9 digitos al tlf.
        String otro="";
        
        if(telefono.length() == 9){
            otro = telefono;             
        }
        this.telefono = otro;
    }

    @Override
    public String toString() {
        return matricula+ " "+modelo+" "+color; //ToString que indica matricula,modelo y color del vehiculo.
    }
    
    

    
}
