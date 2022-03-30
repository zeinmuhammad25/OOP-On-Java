package com.rizqifauzan;

public class Segitiga {

    // int
    // String
    // double
    // boolean


    // Modifier
    //   - public
    //   - private
    //   - protected

    private int alas;
    private int tinggi;
    private double luas;

    public float getLuas(int alas, int tinggi) {
        float luas = alas*tinggi/2;
        return luas;
    }

    public void cetakLuas(){
        System.out.println("Cetak Luas");
    }

    public void cobaError(){

        int a = 5;
        int b = 0;

        try {
            float c = a/b;
        } catch (Exception e){
            System.out.println("Error : " + e.toString());
        }

        System.out.println("Hai");
    }

}
