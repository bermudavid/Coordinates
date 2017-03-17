/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coord;

/**
 *
 * @author Bermu
 */
public class Cartesian {
    private double x;
    private double y;
    private double z;
    
    public Cartesian(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Cartesian(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    
    
    /**
     * 
     * Turns the cartesians coordinates into Cilindrical
     * @return Objetc in Cilindrical coords
     */
    public Cilindrical toCilindrical(){
        Cilindrical cil = new Cilindrical();
        if(x == 0 && y == 0){
            cil.setP(0);
            cil.setFi(0);           
        } else {
            cil.setP(Math.sqrt((x*x) + (y*y)));
            cil.setFi(Math.atan(y/x));
        } 
        cil.setZ(z);
        return cil;
    }
    /**
     * 
     * @return object in cilindrical coordinates
     */
    public Spherical toSpherical(){
        Spherical sph = new Spherical();
        
        if((x == 0 && y == 0 && z == 0))
            return sph;
        sph.setR(Math.sqrt(x*x + y*y + z*z));
        sph.setTheta( (Math.atan(Math.sqrt(x*x + y*y)/z)) );
        sph.setFi(Math.atan(y/x));
        return sph;
    }
    @Override
    public String toString(){
        return  "Cartesians coordinates: x = " + x + ", " + "y = " + y + ", " + "z = " + z;
    }
    
}
