package abms.com;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Teste 0");
        minhaListaEncadeada.add("Teste 1");
        minhaListaEncadeada.add("Teste 2");
        minhaListaEncadeada.add("Teste 3");
        minhaListaEncadeada.add("Teste 4");
        System.out.println(minhaListaEncadeada);


        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println("-------------------------");
        System.out.println(minhaListaEncadeada);
        System.out.println("-------------------------");
        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);
        System.out.println("-------------------------");
        minhaListaEncadeada.add("Nó Adicionado");
        System.out.println(minhaListaEncadeada);
        System.out.println("-------------------------");
        System.out.println(minhaListaEncadeada.get(6)); // throws an exception
        System.out.println("-------------------------");


    }
}
