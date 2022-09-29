package com.tiernoparla.ejercicioselementales;

import java.util.Scanner;

public class ejerciciosElementales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N;
        int D;

        System.out.println("Dame N: ");
        N = sc.nextInt();

        System.out.println("Dame D: ");
        D = sc.nextInt();

        int R = N;
        int Q = 0;

        while (R >= D) {
            R = R - D;
            Q++;
        } // while

        System.out.println(N == D * Q + R);

        /*
        int n = 1;
        while(n < 11){
            if(n%2==0){
                System.out.println(n);
            } // if             
            n++;
        } // while
        
        
        // printear nums pares del 1 al 10 V2
        for(int i = 1; i <= 10; i++){
            if(i%2 == 0){
                System.out.println(i);
            } // if
        } // for
       
         */
 /*
        // printear nums pares del 1 al 10
        for(int i = 2; i < 11; i=i+2){
            System.out.println(i);
        } // for
         */
    } // main
} // ejerciciosElementales
