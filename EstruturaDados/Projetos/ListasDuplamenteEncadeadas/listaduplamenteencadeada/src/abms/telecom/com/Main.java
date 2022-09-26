package abms.telecom.com;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();
        listaDuplamenteEncadeada.add("c0");
        listaDuplamenteEncadeada.add("c1");
        listaDuplamenteEncadeada.add("c2");
        listaDuplamenteEncadeada.add("c3");
        listaDuplamenteEncadeada.add("c4");
        listaDuplamenteEncadeada.add("c5");
        listaDuplamenteEncadeada.add("c6");

        System.out.println(listaDuplamenteEncadeada);
        System.out.println("----------------------------------");
        listaDuplamenteEncadeada.remove(3);
        System.out.println(listaDuplamenteEncadeada);
        System.out.println("----------------------------------");
        listaDuplamenteEncadeada.add(3, "999");
        System.out.println(listaDuplamenteEncadeada);
        System.out.println("----------------------------------");
        System.out.println(listaDuplamenteEncadeada.get(3));
        System.out.println("----------------------------------");


    }
}
