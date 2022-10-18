package com.abms.exceptions;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class UncheckedException {
    public static void main(String[] args) {




        String  a = JOptionPane.showInputDialog("Numeroador:");
        String  b = JOptionPane.showInputDialog("Denominador:");
        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }catch(NumberFormatException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe números inteiros! " + e.getMessage());
        }catch(ArithmeticException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ipossível dividir por 0");
        }finally{
            System.out.println("Passou pelo Finally!.... ");
        }
        System.out.println("Saiu do Try-Catch!....... e o código continua!");


    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
