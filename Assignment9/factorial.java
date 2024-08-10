package com.sgtest.Assignment9;

public class factorial {
    public static void main(String[] args) {
        int num=5;
        int k=1;
        for(int i=1;i<=num;i++){
            k=k*i;
        }
        System.out.println("given factorial"+num+"number is:"+ k);
    }
}
