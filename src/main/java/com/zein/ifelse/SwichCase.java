package com.rizqifauzan.ifelse;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input huruf :" );
        String nilaiHuruf = scanner.nextLine();

        switch (nilaiHuruf){
            case "A":
            case "a":
                System.out.println("Amat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Sangat Kurang");
                break;
            default:
                System.out.println("Nilai yang dimasukan salah");
                break;
        }
    }
}
