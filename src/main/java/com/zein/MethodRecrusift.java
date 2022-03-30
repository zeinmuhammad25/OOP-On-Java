package com.rizqifauzan;

public class MethodRecrusift {

    // 3! = 1x2x3
    // 4! = 4x3x2x1
    public int faktorial(int i){
        if(i<=1){
            return i;
        }else{
            int b = faktorial(i-1);
            int c = i * b;
            return c;
        }
    }

    public static void main(String[] args) {
        int a = 4;
        MethodRecrusift methodRecrusift = new MethodRecrusift();
        System.out.println(methodRecrusift.faktorial(a));
    }

}

// 0,1,1,2,3,5,8,13,21,....