import java.util.Scanner;

public class NovoAboutMe {
    public static void main(String[] args) {

        //criando objeto scanner
        Scanner scanner = new Scanner(System.in);

        //recebendo informações do usuário
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        //imprimindo resultados
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " m");
        System.out.println("E peso " + peso + " Kg.");


    }
}
