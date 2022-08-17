public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada: " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        smartTV.diminuirVolume();
        System.out.println("Volume: " + smartTV.volume);

        smartTV.subirCanal();
        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.mudarCanal(26);
        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.desligar();
        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Fim da execução!");




    }
}
