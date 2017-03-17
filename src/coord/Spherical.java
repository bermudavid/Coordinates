/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coord;

/**
 * This class is a representation of Spherical cords
 * @author Bermu
 */
public class Spherical {
    private double r;
    private double theta;
    private double fi;
    /**
     * Constructors
     * @param r - radius
     * @param theta - angle 1
     * @param fi - angle 2
     */
    public Spherical(double r,double theta,double fi){
        this.r = r;
        this.theta = theta;
        this.fi = fi;
    }
    public Spherical(){
        this.r = 0;
        this.theta = 0;
        this.fi = 0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getFi() {
        return fi;
    }

    public void setFi(double fi) {
        this.fi = fi;
    }
    
    /**
     * Turns the Spherical coordinates into Cartesian
     * @return object in Cartesian coordinates
     */
    public Cartesian toCartesian(){
        Cartesian cart = new Cartesian();
        cart.setX(r*Math.sin(theta)*Math.cos(fi));
        cart.setY(r*Math.sin(theta)*Math.sin(fi));
        cart.setZ(r*Math.cos(fi));
        return cart;
    }
        
    /**
     * Turns the Spherical coordinates into Cilindrical
     * @return object in Cilindrical coordinates
     */
    public Cilindrical toCilindrical(){
        Cilindrical cil = new Cilindrical();
        cil.setP(r*Math.sin(theta));
        cil.setZ(r*Math.cos(theta));
        cil.setFi(fi);
        return cil;
    }

   
    @Override
    public String toString(){
        return  "Spherical coordinates: r = " + r + ", " + "Theta = " + theta + ", " + "Phi = " + fi;
    }
}
