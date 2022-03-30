package com.rizqifauzan.bangunDatar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HitungBangunLingkaran {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai jari jari : ");
        int r = 0;

        try {
            r = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Hanya menerima angka");
        }

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(r);

        System.out.println("Luas Lingkaran = " + lingkaran.getLuas());

    }

}
