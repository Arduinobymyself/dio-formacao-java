public class Moto extends Veiculo {

    public void ligar(){
        confereCombustivel();
        pontoMorto();
        giraChave();
        System.out.println("Moto LIGADA");
    }


    private void confereCombustivel(){
        System.out.println("conferindo combustível");
    }

    private void pontoMorto(){
        System.out.println("conferindo câmbio em P");
    }

    private void giraChave(){
        System.out.println("chave acionada");
    }
}
