/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segitiga;

/**
 *
 * @author praktikan
 */
public class Segi3SamaKaki extends Segitiga{

    
    public Segi3SamaKaki() {
        setA(6);
        setT(4);
        
    }

    public Segi3SamaKaki(double a, double t) {
        super(a, t);
        double miring = Math.pow( a/2 * a/2 + t*t, 0.5);
        setS2(miring);
        setS3(miring);
    }
    
    @Override
    public String toString() {
        return  "a=" + getA() + ", t=" + getT() + '}';
    }
}
