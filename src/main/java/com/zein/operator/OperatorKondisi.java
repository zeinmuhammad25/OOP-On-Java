package com.rizqifauzan.operator;

public class OperatorKondisi {
    public static void main(String[] args){

        int nilai = 50;
        int kkm = 60;

        String status = "";

        if(nilai<kkm){
            status = "Tidak Lulus";
        }else {
            status = "Lulus";
        }

        System.out.println(status);

        String check = (nilai<kkm) ? "Tidak Lulus" : "Lulus";
        System.out.println("Status : " + check);

    }
}
