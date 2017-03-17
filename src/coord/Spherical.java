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
public class Spherical {
    private double r;
    private double theta;
    private double fi;
    
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
    @Override
    public String toString(){
        return  "Spherical coordinates: r = " + r + ", " + "Theta = " + theta + ", " + "Phi = " + fi;
    }

}
