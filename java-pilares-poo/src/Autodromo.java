public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto honda = new Moto();


        System.out.println("-=-=-=-= Jeep =-=-=-=-");
        jeep.setChassi("ads97a9dsafks7");
        jeep.ligar();

        System.out.println("-=-=-=-= Honda =-=-=-=-");
        honda.setChassi("ad7a5da98dfs55ssd");
        honda.ligar();

        System.out.println("-=-=-=-= Coringa =-=-=-=-");
        Veiculo coringa = jeep;
        coringa.ligar();





    }
}
