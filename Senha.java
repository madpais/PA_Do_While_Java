/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senha;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Senha {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha = "abc123";
        String key;
        
        do {
            System.out.println("Digite uma senha");
            key = ler.nextLine();
        } while(!key.equals(senha));
        
        System.out.println("Parabéns");
    }
}
