public class Conta {
    //variável da classe Conta
    double saldo = 100.0;

    public void sacar(Double valor){
        //variável local do método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //disponível em toda a classe
        System.out.println(saldo);
        //disponível somente no método sacar, vai gerar um erro
        //System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x = 1; x <= 5; x++){//x é uma vairável com escopo de fluxo
            //esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponíveis fora do for

        return valorMontante;
    }
}
