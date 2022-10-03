package com.abmstelecom.arrays;


import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios
entre (0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for(int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = random.nextInt(100);
        }

        System.out.println("Números aleatórios:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nAntecessores dos Números aleatórios:");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.println("\nSucessores dos Números aleatórios:");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
