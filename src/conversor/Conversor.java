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
        //initializations
        Cartesian cart = new Cartesian(0,0,1);
        Cilindrical cil = cart.toCilindrical();
        Spherical sph = cart.toSpherical();
        /* Test
        System.out.println("Cartesian in others");
        System.out.println(cart.toString());
        System.out.println(cil.toString());
        System.out.println(sph.toString());
        */
        
        //new inits
        cil = new Cilindrical(1,5,0);
        cart = cil.toCartesian();
        //Test 2
        
        System.out.println("Cilindrical in others");
        System.out.println(cil.toString());
        System.out.println(cart.toString());
        //System.out.println(sph.toString());
        
    }
    
}
