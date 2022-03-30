package com.rizqifauzan.operator;

public class Increment {

    public static void main(String[] args) {

        int number = 7;

        // increment => menambahkan nilai 1 ke varible
        // decrement => mengurangi nilai 1 ke variable

        // --number => dikurangi dulu baru dipakai
        // number-- => dipakai dulu baru dikurang
        // ++number => ditambahkan dulu baru dipakai
        // number++ => dipakai dulu baru ditambahkkan

        System.out.println(number++ - number-- + 4);

        char nilai = 'A';
        System.out.println(++nilai+7);

        char sample = 'a';
        System.out.println(sample+1);

        String nama = "Fauzan";

    }
}