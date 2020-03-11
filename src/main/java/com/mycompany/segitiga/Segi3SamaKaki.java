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
        setS2((int)Math.pow( (getA()/2) * (getA()/2) + (getT()*getT()), 0.5));
        setS3((int)Math.pow( (getA()/2) * (getA()/2) + (getT()*getT()), 0.5));
        
    }

    public Segi3SamaKaki(int a, int t) {
        super(a, t);
 
        setS2((int)Math.pow( (getA()/2) * (getA()/2) + (getT()*getT()), 0.5));
        setS3((int)Math.pow( (getA()/2) * (getA()/2) + (getT()*getT()), 0.5));
    }
    
    @Override
    public String toString() {
        return  "a=" + getA() + ", t=" + getT() + '}';
    }
}
