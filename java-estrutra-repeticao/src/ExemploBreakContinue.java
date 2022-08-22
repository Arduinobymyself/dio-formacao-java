public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                break; //finaliza o laço, ou seja interrompe depois do 2
            System.out.println(numero);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue;//vai para próxima iteração, ou seja, pula o 3 e continua
            System.out.println(numero);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
