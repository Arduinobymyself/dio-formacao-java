package com.abmstelecom.oop.aula06;

public class Rodaraplicacao {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new CasseFilha1(), new ClasseFilha2(), new ClasseMae(){}};
        for(ClasseMae classe : classes){
            classe.metodo1(); // sobrescrita com polimorfismo
        }
        System.out.println("=================================================");
        for(ClasseMae classe : classes){
            classe.metodo2(); // sobrescrita com polimorfismo
        }
        System.out.println("=================================================");
        ClasseFilha2 classeFilha2 = new ClasseFilha2(); // sobrescrita pura
        classeFilha2.metodo2();
        System.out.println("=================================================");
    }
}
