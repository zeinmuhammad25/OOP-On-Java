package com.rizqifauzan.ifelse;

import java.util.Scanner;

public class CobaIfElseIF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input angka :" );
        int number = scanner.nextInt();

        NilaiHuruf nilaiHuruf = new NilaiHuruf();
        nilaiHuruf.setNilai(number);
        nilaiHuruf.cetakNilaiHuruf();

    }
}
