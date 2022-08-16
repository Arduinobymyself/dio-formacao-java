package abmsTelecom.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;


@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
        System.out.println("Somando: " + calculadora.somar(2, 7));
        System.out.println("Subtraindo: " + calculadora.subtrair(2, 7));
        System.out.println("Multiplicando: " + calculadora.multiplicar(2, 7));
        System.out.println("Dividindo: " + calculadora.dividir(2, 0));
    }
}
