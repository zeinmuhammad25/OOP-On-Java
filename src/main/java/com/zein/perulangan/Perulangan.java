package com.rizqifauzan.perulangan;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int baris = scanner.nextInt();
        int i, j;

        for (i = 0; i <= baris; i++) { // misal input 5
            // 0 kurang dari sama dengan 5 kah? ya dia masuk ke looping & nilai bertambah 1 sampai 5x
            // sudah nyetak *****

            for (j = 0; j <= baris - i; j++)
                System.out.print(" ");// baca kondisi ini. 0 kurang dari sama dengan 5 ga? kalo iya
            // maka 5 dikurang 1 (knp 1? karena dari for awal sudah bertambah 1)
            // hasilnya 4, jadi **** yg tercetak kosong

            for (j = 0; j < i; j++) { //0 kurang dari 1 ga? dia akan cetak bintang
                System.out.print("*");
            }
            System.out.println(); // akan looping ke bawah
        }
    }
}