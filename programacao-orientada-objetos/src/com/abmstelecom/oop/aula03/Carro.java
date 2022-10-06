package com.abmstelecom.oop.aula03;

// criar a classe carro
public class Carro {

    //criar atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtores - sobrecarga
    public Carro() {

    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //getters and setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //métodos
    public double valorTotalTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


}
