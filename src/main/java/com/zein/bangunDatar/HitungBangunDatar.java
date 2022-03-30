package com.rizqifauzan.bangunDatar;

import java.util.Scanner;

public class HitungBangunDatar {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikasi Lingkaran");
        System.out.print("Masukan nilai Jari jari : ");

        int r = scanner.nextInt();

        System.out.println("===================");

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(r);

        System.out.println("Diameter : "+ lingkaran.getDiameter());
        System.out.println("Luas : "+ lingkaran.getLuas());
        System.out.println("Keliling : "+ lingkaran.getKeliling());

        // Kubus kubus = new Kubus();
        //kubus.setSisi(19);

        // System.out.println("Volume " + )
        // System.out.println("Luas Permukaan " + )
        // System.out.println("Panjang rusuk " + )
    }
}
