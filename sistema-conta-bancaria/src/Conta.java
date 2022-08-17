public class Conta {
    //vari�vel da classe Conta
    double saldo = 100.0;

    public void sacar(Double valor){
        //vari�vel local do m�todo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //dispon�vel em toda a classe
        System.out.println(saldo);
        //dispon�vel somente no m�todo sacar, vai gerar um erro
        //System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //vari�vel local de m�todo
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x = 1; x <= 5; x++){//x � uma vair�vel com escopo de fluxo
            //esta vari�vel ser� reiniciada a cada execu��o
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estar�o dispon�veis fora do for

        return valorMontante;
    }
}
