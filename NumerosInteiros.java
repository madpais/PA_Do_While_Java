/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosinteiros;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NumerosInteiros {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);    
    int x = 0;
    int n;
    do {
        System.err.println("Digite um número");
        n = ler.nextInt();
        x++;
    } while (n !=0);
        
        System.out.println("Vc digitou " + x + " números");
        
    }
}
