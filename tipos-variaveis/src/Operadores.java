import jdk.swing.interop.SwingInterOpUtils;

public class Operadores {
    public static void main(String[] args) {

        //OPERADORES DE ATRIBUIÇÃO (=)
        String nome = "Marcelo";
        int idade = 51;
        double peso = 73.2;
        char sexo = 'M';
        boolean doadorOrgao = true;
        //Date dataNascimento = new Date(); // o tipo Date necessita ser definido


        //OPERADORES ARITMÉTICOS
        // +, -, * e /
        double soma = 10.5 + 15.7;
        int subtrtacao = 113 - 25;
        int multiplicacao = 20 * 7;
        double divisao = 15.0 / 2.0;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);


        //Concatenação (+)
        String nomeCompleto = "Linguagem" + " " + "Java";
        System.out.println(nomeCompleto); // Linguagem Java

        System.out.println(nome + " tem " + idade + " anos de idade e pesa " + peso + " Kg eh do sexo " + sexo +
                " e doa orgaos: " + doadorOrgao);

        //Qual o resultado das expressões abaixo
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31
        concatenacao = 1 + 1 + "1" + 1 ;
        System.out.println(concatenacao); // 211
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // 1111
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // 1111


        //OPERADORES UNÁRIOS
        int numero = 5;

        //Imprimendo o número negativo
        System.out.println(-numero); // -5 imprime a inversão, mas não modifica o número
        System.out.println(numero);  // 5

        //incrementando o número
        // numero = numero + 1
        numero++;
        System.out.println(numero); // 6

        //incrementando novamente
        System.out.println(numero++); // 6 primeiro imprimiu o valor e depois incrementou
        System.out.println(numero); // 7 número já incrementado


        //ordem de precedência conta
        System.out.println(++numero); // 8 nesse caso, primeiro ele incrementa e dpois imprime

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro); // Inverteu false


        //operador ternário
        int a, b;
        a = 6;
        b = 5;

        String resultadoOperadorTernario = (a == b) ? "Verdadeiro, a = b" : "Falso, a != b";
        System.out.println(resultadoOperadorTernario);

        //OPERADORES RELACIONAIS
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.println("numero1 maior que numero2");
        if(numero1 < numero2)
            System.out.println("numero1 menor que numero2"); // será impresso
        if(numero1 >= numero2)
            System.out.println("numero1 maior ou igual que numero2");
        if(numero1 <= numero2)
            System.out.println("numero1 menor ou igual que numero2"); // será impresso
        if(numero1 != numero2)
            System.out.println("numero1 diferente de numero2"); // será impresso

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println(nome1 == nome2); // true
        String nome3 = new String("JAVA");
        System.out.println(nome1 == nome3); // false
        String nome4 = nome3;
        System.out.println(nome3 == nome4); // true

        //usando equals
        System.out.println(nome1.equals(nome2)); // true
        System.out.println(nome3.equals(nome3)); // true
        System.out.println(nome3.equals(nome4)); // true


        numero1 = 130;
        numero2 = 130;
        System.out.println(numero1 == numero2); // true


        //tratando como objeto
        Integer numero3 = 130;
        Integer numero4 = 130;
        System.out.println(numero3 == numero4); // false
        // a razão pela qual o resultado é false, é devido que o Java trata os valores
        // como objetos a partir da criação da variável
        // quando queremos comparar objetos, usamos o método equals
        System.out.println(numero1.equals(numero2));

    }
}
