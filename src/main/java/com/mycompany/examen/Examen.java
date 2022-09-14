
package com.mycompany.examen;

import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int [] n1 = new int [3];        
        int [] n2 = new int [3];
        String s = "";
        float n;
        
        while ( !"oscurecer".equals(s)) {            
         
            for (int i = 0; i < n1.length; i++) {
            System.out.println("Digite el numero");
            n1[i] = sc.nextInt();
            }
            for (int j = 0; j < n2.length; j++) {
            System.out.println("Digite el numero");
            n2[j] = sc.nextInt();
            }
            s = sc.next();
        }
        System.out.println("");
        System.out.println("porcentaje a oscurecer");
        n = sc.nextInt();
        n = n/100;
     
        System.out.println("");
        
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == 255) {
                n1[i] = n1[i] + 0;
            }else{
                n1[i] = (int) ((n1[i]*n)+n1[i]);
        }
        }
        for (int i = 0; i < n2.length; i++) {
            if (n2[i] == 255) {
                n2[i] = n2[i] + 0;
            }else{
                n2[i] = (int) ((n2[i]*n)+n2[i]);
        }
        }
        for (int i = 0; i < n1.length; i++) {
            System.out.print(n1[i]+"\t");
        }
        for (int i = 0; i < n2.length; i++) {
            System.out.print(n2[i]+"\t");
        }
    }
}