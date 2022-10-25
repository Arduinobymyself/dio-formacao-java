public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("=== Estrato de Conta Poupanca ===");
        super.imprimirInfoComuns();

    }
}
