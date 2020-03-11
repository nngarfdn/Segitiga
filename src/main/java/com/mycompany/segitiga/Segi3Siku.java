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
public class Segi3Siku extends Segitiga{

    double miring = Math.pow( getA()*getA() + getT()*getT(), 0.5) ;
    public Segi3Siku() {
        setA(4);
        setT(3);
    }

    public Segi3Siku(double a, double t) {
        super(a, t);
        setS2(t);
        setS3(miring);
    }

    @Override
    public String toString() {
        return  "a=" + getA() + ", t=" + getT() + '}';
    }
    
    
}
