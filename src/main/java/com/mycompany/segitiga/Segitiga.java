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
    int a;
    int t;
    int s2;
    int s3 ;
    int luas;
    int keliling;

    public Segitiga() {
    }

    
    public Segitiga(int a, int t) {
        this.a = a;
        this.t = t;
 
    }
    
    
    

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public double getLuas() {
        luas = this.a * this.t /2 ;
        return (int)luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        keliling = this.a + this.s2 + this.s3 ;
        return (int) keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }
    
    
}
