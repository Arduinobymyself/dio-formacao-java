import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagenInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        /*
        System.out.println("-=-=-=-= MSN MESSENGER=-=-=-=-");
        apps.MSNMessenger msn = new apps.MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("-=-=-=-= FACEBOOK MESSENGER=-=-=-=-");
        apps.FacebookMessenger facebook = new apps.FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("-=-=-=-= TELEGRAM MESSENGER=-=-=-=-");
        apps.Telegram telegram = new apps.Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
        */

        ServicoMensagenInstantanea smi = null;
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
