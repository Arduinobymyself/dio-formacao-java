package com.abmstelecom.metodos;


public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios da Classe Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(6, 4);
        Calculadora.multiplicacao(4, 3);
        Calculadora.divisao(4, 2);
        System.out.println("============================================");


        System.out.println("Exercicios da Classe Mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);
        System.out.println("============================================");

        System.out.println("Exercícios da Classe Emprestimo");
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);
        Emprestimo.calcularEmprestimo(1000, 3);
        System.out.println("============================================");


    }
}
