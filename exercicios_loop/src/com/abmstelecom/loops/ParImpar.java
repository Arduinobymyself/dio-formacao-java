package com.abmstelecom.loops;


/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */


import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;
        do {
            System.out.println("Número");
            numero = scan.nextInt();
            if(numero % 2 == 0){
                par += 1;
            } else{
                impar += 1;
            }
            contador++;
        } while(contador < quantidadeNumeros);

        System.out.println("Foram digitados " + par + " números pares e " + impar + " números impares");
    }
}
