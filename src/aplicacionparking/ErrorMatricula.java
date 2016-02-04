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
public class ErrorMatricula extends RuntimeException {
    public ErrorMatricula(){
        super("La matricula no es valido");
    }
}
