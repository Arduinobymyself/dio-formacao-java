public class SistemaIBGE {
    public static void main(String[] args) {
        // imprimindo os estados do enum
        for(EstadoBrasileiro uf : EstadoBrasileiro.values()){
            System.out.println(uf.getSigla() + " - " + uf.getNome());
        }

        // selecionando um estado a partir das opções disponiveis
        EstadoBrasileiro estadoBrasileiro = EstadoBrasileiro.SAO_PAULO;

        System.out.println(estadoBrasileiro.getNome());
        System.out.println(estadoBrasileiro.getSigla());
        System.out.println(estadoBrasileiro.getNomeMaiusculo());
        System.out.println(estadoBrasileiro.getDDD());
    }
}
