/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;
import coord.*;

/**
 *
 * @author Bermu
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cartesian cart = new Cartesian(0,0,0);
        Cilindrical cil = new Cilindrical();
        
        cil = cart.toCilindrical(); // returns objects type Cilindrical
        
        System.out.println(cil.getP() + " " + cil.getFi()+ " " + cil.getZ());
        
    }
    
}
