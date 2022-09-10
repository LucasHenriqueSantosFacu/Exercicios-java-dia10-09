package com.lucas_java.exerciodia09_1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetT[] = new int[100];
        int i;
        for (i=0; i < vetT.length; i++ ) {
            System.out.println(" "+vetT[i]);
            if (i > 100) {
                break;
            }
        }
    }
}
