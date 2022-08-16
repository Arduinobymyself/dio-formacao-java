package abmsTelecom.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtrair(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2){

        if(numero2 == 0.0){
            System.out.print("Erro!.... ");
            return 0;
        }

        return numero1 / numero2;

    }
}
