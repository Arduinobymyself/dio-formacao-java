package com.abmstelecom.sobrecarga;

public class Main {
    public static void main(String[] args) {

        Quadrilatero.area(4);
        Quadrilatero.area(4d, 2d);
        Quadrilatero.area(4, 2, 5);
        Quadrilatero.area(4f, 6f);

    }
}
