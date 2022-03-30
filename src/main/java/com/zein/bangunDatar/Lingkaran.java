package com.rizqifauzan.bangunDatar;

public class Lingkaran {

    private float jariJari;
    private double luas;
    private float diameter;
    private double phi = 3.14;
    private double keliling;

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public float getDiameter() {
        diameter = 2 * jariJari;
        return diameter;
    }

    public double getKeliling() {
        keliling = 2 * phi * jariJari;
        return keliling;
    }

    public double getLuas(){
        if ( jariJari%7==0){
            luas = jariJari * jariJari * 22 / 7;
        }else{
            luas = phi * jariJari * jariJari;
        }

        return luas;
    }

}
