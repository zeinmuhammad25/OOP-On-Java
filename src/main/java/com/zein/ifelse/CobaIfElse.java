package com.rizqifauzan.ifelse;

import java.util.Scanner;

public class CobaIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("input angka :" );
        int number = scanner.nextInt();

        if(number%2==0){
            System.out.println("Bilangan Genap");
        }else {
            System.out.println("Bilangan Ganjil");
        }


    }
}
