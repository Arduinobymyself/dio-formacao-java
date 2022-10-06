package com.abmstelecom.oop.aula03;

public class rodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW - M3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(5.67));
        System.out.println("=================================================");

        Carro carro2 = new Carro("Preto", "Audi", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(5.67));
        System.out.println("=================================================");

    }
}
