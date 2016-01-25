/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionparking;

/**2
 *
 * @author daw1
 */
public class AplicacionParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking park= new Parking("Pepinillo");
        Vehiculo v= new Vehiculo("123TG","134fgh");
        Plaza p1= new Plaza(1,2);
        System.out.println("");
        System.out.println(park.alquilar(v));
        System.out.println(p1.precio());
    
    }
    
    
}
