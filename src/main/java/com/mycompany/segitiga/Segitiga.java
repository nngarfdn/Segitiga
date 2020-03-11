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
public class Segitiga {
    double a;
    double t;
    double s2;
    double s3 ;
    double luas;
    double keliling;

    public Segitiga() {
    }

    
    public Segitiga(double a, double t) {
        this.a = a;
        this.t = t;
    }
    
    
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getLuas() {
        luas = this.a * this.t /2 ;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        keliling = this.a + this.s2 + this.s3 ;
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    
    
}
