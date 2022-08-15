public class Operadores {
    public static void main(String[] args) {

        //operadores de atribuição (=)
        String nome = "Marcelo";
        int idade = 51;
        double peso = 73.2;
        char sexo = 'M';
        boolean doadorOrgao = true;
        //Date dataNascimento = new Date(); // o tipo Date necessita ser definido


        //Operadores Aritméticos
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


        //Operadores unários
        int numero = 5;

        //Imprimendo o número negativo
        System.out.println(- numero); // -5
        System.out.println(numero);  // 5

        //incrementando o número
        numero ++;
        System.out.println(numero); // 6

        //incrementando novamente
        System.out.println(numero ++); // 6
        System.out.println(numero); // 7


        //ordem de precedência conta
        System.out.println(++ numero); // 8

        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro); // Inverteu false



    }
}
