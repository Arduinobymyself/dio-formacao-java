package com.abmstelecom.oop.aula08;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void adicao(double a, double b) {
        System.out.println("Soma " + (a+b));
    }

    @Override
    public void subtracao(double a, double b) {
        System.out.println("Soma " + (a-b));
    }

    @Override
    public void multiplicacao(double a, double b) {
        System.out.println("Soma " + (a*b));
    }

    @Override
    public void divisao(double a, double b) {
        System.out.println("Soma " + (a/b));
    }
}
