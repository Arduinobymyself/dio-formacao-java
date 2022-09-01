public class Carro extends Veiculo {
    public void ligar(){
        confereCambio();
        confereCombustivel();
        apertaBotao();
        System.out.println("carro LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("conferindo combustível");
    }

    private void confereCambio(){
        System.out.println("conferindo câmbio em P");
    }

    private void apertaBotao(){
        System.out.println("botão apertado");
    }
}
