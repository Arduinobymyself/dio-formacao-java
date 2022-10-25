public class Main {
    public static void main(String[] args) {

        Cliente marcelo = new Cliente();
        marcelo.setNome("Marcelo Moraes");
        Conta cc = new ContaCorrente(marcelo);
        Conta cp = new ContaPoupanca(marcelo);

        cc.depositar(1000);
        cc.transferir(100,cp);
        cc.sacar(200);

        cc.imprimirEstrato();
        cp.imprimirEstrato();
    }
}
