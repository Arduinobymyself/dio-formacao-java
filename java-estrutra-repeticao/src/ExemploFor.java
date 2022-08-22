public class ExemploFor {
    public static void main(String[] args) {

        //forma básica
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        //outra fomra - mesmo resultado
        int carneirinhos = 1;
        for( ; carneirinhos <= 20; ){
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos++;
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
