package com.rizqifauzan.operator;

import java.net.StandardSocketOptions;

public class Logika {

    public static void main(String[] args){

        // & => And
        // | => or

        // jika saya punya keyboard dan mouse, saya bisa kerja
        boolean isKeyboard = true;
        boolean isMouse = false;

        if(isKeyboard & isMouse){
            System.out.println("berangkat");
        }

        // Jika saya punya laptop atau komputer maka saya bisa ngoding

        boolean isLaptop = false;
        boolean isKomputer = true;
        if(isKomputer | isLaptop){
            System.out.println("saya bisa ngoding");
        }

        // &&
        // ||

        if(isKeyboard && isMouse){
            System.out.println("berangkat");
        }

        if(isKomputer || isLaptop){
            System.out.println("saya bisa ngoding");
        }


        // XOR ^               |  1     | 2         | 3         | 4             |
        // Jika hari ini cerah |  yes   | yes       | No        | No            |
        // Bawa payung         | Yes    | No        | yes       | No            |
        // result              | useless | correct  | correct   | hujan hujanan |
        boolean a = true;
        boolean b = true;
        if(a^b){
            System.out.println("a & b : salah satunya true");
        } else {
            System.out.println("a & b : false semua atau true semua");
        }


        // ! => Not
        // bukan

        boolean j = true;
        System.out.println(!j);


        boolean q = false;
        boolean w = false;
        boolean e = false;
        boolean r = false;
        boolean t = false;

        boolean y = ( !w && (w ^ !q ) | e );
                // ( true && ( false ^ true ) or false )
                // ( true && ( true ) or false
                //  true or false
                //  true
        System.out.println("Nilai y : " + y);

    }

}
