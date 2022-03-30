package com.rizqifauzan;

public class BasicPrograming {

    public static void main (String[] args){

        int a = 5;
        int b = 2;

        try{
            double c = a/b;
            System.out.println("nilai c = " + c);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("program selesai");
    }

}
