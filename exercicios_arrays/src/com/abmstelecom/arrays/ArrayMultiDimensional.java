package com.abmstelecom.arrays;


import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 */
public class ArrayMultiDimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        //preenchendo a matriz M
        for(int l = 0; l < M.length; l++){
            for(int c = 0; c < M.length; c++){
                M[l][c] = random.nextInt(9);
            }
        }

        //imprimindo a matriz M
        System.out.println("\nUsando laço for");
        for(int l = 0; l < M.length; l++){
            for(int c = 0; c < M.length; c++){
                System.out.print(M[l][c] + " ");
            }
            System.out.println("");
        }

        //usando foreach
        System.out.println("\nUsando laço foreach");
        for (int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + " ");
            }
            System.out.println("");
        }
    }
}
