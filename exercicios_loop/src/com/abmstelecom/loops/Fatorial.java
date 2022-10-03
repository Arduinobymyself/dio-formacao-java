package com.abmstelecom.loops;



/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário.
Exemplo: 5! = 120
5 x 4 x 3 x 2 x 1 = 120
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        System.out.println("Fatorial de : ");
        numero = scan.nextInt();

        for(int i = numero; i > 1; i--){
            if(numero == 0){
                fatorial = 1;
                break;
            }
            fatorial *= i;
        }

        System.out.println("O Fatorial de " + numero + " é " + fatorial);

    }
}
