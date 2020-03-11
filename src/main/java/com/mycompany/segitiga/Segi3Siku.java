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

    
    public Segi3Siku() {
        setA(4);
        setT(3);
        setS2(3);
        setS3((int)Math.pow( getA()*getA() + getT()*getT(), 0.5));
    }

    public Segi3Siku(int a, int t) {
        super(a, t);
        setS2(t);
        setS3((int)Math.pow( getA()*getA() + getT()*getT(), 0.5));
    }
    
    

    @Override
    public String toString() {
        return  "a=" + getA() + ", t=" + getT() + '}';
    }
    
    
}
