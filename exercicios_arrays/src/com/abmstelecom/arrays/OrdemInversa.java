package com.abmstelecom.arrays;


/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-6, 0, 15, 8, 50, 4};

        System.out.println("Vetor Ordem normal:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }


        System.out.println("\n\nVetor Ordem Inversa:");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }


    }
}
