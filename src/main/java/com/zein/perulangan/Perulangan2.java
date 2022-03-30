package com.rizqifauzan.perulangan;

import java.util.Scanner;

public class Perulangan2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan alas segitiga ");
        int alas = scanner.nextInt();
        boolean isGenap = (alas%2==0);
        int nilaiTengah = (isGenap) ? alas/2 : alas/2+1;


        int baris = nilaiTengah;

        System.out.println(nilaiTengah);

        // baris
        for(int i=1; i<=baris; i++){
            int panjangSpace = nilaiTengah - i;

            // cetak space / o
            for(int j = 1; j<=panjangSpace; j++){
                System.out.print("o");
            }

            //cetak x
            int jumlahCetak = (isGenap) ? i*2 : i*2-1;
            for (int k = 1; k<=jumlahCetak; k++){
                System.out.print("x");
            }

            System.out.println("");
        }


    }

}
