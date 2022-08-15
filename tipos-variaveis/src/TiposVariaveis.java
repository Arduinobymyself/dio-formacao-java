public class TiposVariaveis {
    public static void main(String[] args) {
        //declaração de variáveis
        int idadePai; // declaração sem atribuição
        int anoFabricacao = 2022; // declaração com atribuição
        double salarioMinimo = 2500.00;

        byte idade = 123;
        short ano = 2022;
        int cep = 18050000; //se começar com zero, talvez tenha que ser outro tipo
        long cpf = 12345678910L; //se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        //casting - conversão entre tipos
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; //um short cabe em um int, sem problemas
        short numeroCurto2 = numeroNormal; //apesar de numero normal ser menor que o limite de um short,
        // em algum momento ele poderá ser maior e portanto não é possível fazer o casting
        // e isso provavelmente gerará um erro.


        /*
        esta linha é considerada como declaração de variável iniciamos a existência
        da variável numero com valor 5, regra: tipo + nome + valor
         */
        int numero = 5;

        /*
        na linha abaixo iremos alterar o valor da variável para 10, observe que o tipo
        não é mais necessário, pois a vairável já foi declarada anteriormente
         */
        numero = 10;

        /*
        ao usar a palavra reservada final, você determina que jamais
        esta vairável poderá obter outro valor;
        isso é considerado uma constante em linguagem Java
         */
        final double VALOR_DE_PI = 3.1415927; //constantes devem ser declaradas como final

        VALOR_DE_PI = 3.14; // isso gerará um erro pois uma constante não pode ter seu valor alterado

    }
}
