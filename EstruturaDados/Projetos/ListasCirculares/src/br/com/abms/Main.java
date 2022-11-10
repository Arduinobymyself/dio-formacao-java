package br.com.abms;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        System.out.println(minhaListaCircular);

        minhaListaCircular.add("Dado 1");
        minhaListaCircular.add("Dado 2");
        minhaListaCircular.add("Dado 3");
        minhaListaCircular.add("Dado 4");
        minhaListaCircular.add("Dado 5");
        minhaListaCircular.add("Dado 6");

        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.size());
        minhaListaCircular.remove(1);
        System.out.println(minhaListaCircular);
        minhaListaCircular.add("Adicionado");
        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.size());
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(3));

        System.out.println("==============================================");
        for(int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
        System.out.println("==============================================");



    }
}
