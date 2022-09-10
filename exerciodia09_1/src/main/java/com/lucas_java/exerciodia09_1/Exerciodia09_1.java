

package com.lucas_java.exerciodia09_1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exerciodia09_1 {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int i;
        for(i=0; i < a.length; i++){
            System.out.println("Informe um valor para o vetor A:");
            a[i]=ler.nextInt();
        }
        for(i=0; i < b.length; i++){
         System.out.println("Informe um valor para o vetor B:");
         b[i]=ler.nextInt();
        }
        
         for(i=0; i < c.length; i++){
         c[i]= a[i]- b[i]*a[i];
         System.out.println("O resultado do vetor c é----->"+c[i]);
        
        }
               
    }
}
