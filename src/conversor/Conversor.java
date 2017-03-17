/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;
import coord.*;

/**
 * This Conversor turns coordinate systems in others
 * @author Bermu
 * @version 1.2
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cartesian cart = new Cartesian(1,5,1);
        Cilindrical cil = cart.toCilindrical();
        Spherical sph = cart.toSpherical();
        
        // Uncoment to Test
        //Test 1
        System.out.println("");
        System.out.println("Cartesian in others");
        System.out.println(cart.toString());
        System.out.println(cil.toString());
        System.out.println(sph.toString());

        //Test 2
        cil = new Cilindrical(30,50,4);
        cart = cil.toCartesian();
        sph = cil.toSpherical();
        System.out.println("");
        System.out.println("Cilindrical in others");
        System.out.println(cil.toString());
        System.out.println(cart.toString());
        System.out.println(sph.toString());
        //Test 3 
        
        sph = new Spherical(4,2,8);
        cart = sph.toCartesian();
        cil = sph.toCilindrical();
        System.out.println("");
        System.out.println("Spherical in others");
        System.out.println(sph.toString());
        System.out.println(cart.toString());
        System.out.println(cil.toString());

    }
    
}
