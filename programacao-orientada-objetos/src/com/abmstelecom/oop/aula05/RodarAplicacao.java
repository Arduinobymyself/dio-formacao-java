package com.abmstelecom.oop.aula05;

public class RodarAplicacao {
    public static void main(String[] args) {

        //instancia o objeto
        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast gerando erros
        //Gerente gerente = new Funcionario();
        //Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
