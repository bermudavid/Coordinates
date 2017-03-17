/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coord;

/**
 * Class about representatiof of Cilindrical coordinates
 * @author Bermu
 */
public class Cilindrical {
    private double p;
    private double fi;
    private double z;
    
    public Cilindrical(double p,double fi,double z){
        this.p = p;
        this.fi = fi;
        this.z = z;
    }
    public Cilindrical(){
        this.p = 0;
        this.fi = 0;
        this.z = 0;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getFi() {
        return fi;
    }

    public void setFi(double fi) {
        this.fi = fi;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    /**
     * Turn the Cilindrical coordinates into Cartesian
     * @return Cartesian objetc
     */
    public Cartesian toCartesian(){
        Cartesian cart = new Cartesian();
        cart.setX(p*Math.cos(fi));
        cart.setY(p*Math.sin(fi));
        cart.setZ(z);
        return cart;
    }
    /**
     * Turns the Cilindrical coordinates into Spherical
     * @return object in spherical coordinates
     */
    public Spherical toSpherical(){
        Spherical sph = new Spherical();
        
        sph.setR(Math.sqrt(p*p + z*z));
        sph.setTheta(Math.atan2(p,z));
        sph.setFi(fi);
        return sph;
    }
    
    
    @Override
    public String toString(){
        return  "Cilindrical coordinates: p = " + p + ", " + "Phi = " + fi + ", " + "z = " + z;
    }
    
}
