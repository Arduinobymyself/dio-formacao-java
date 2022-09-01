package apps;

public class Telegram extends ServicoMensagenInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem via apps.Telegram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via apps.Telegram");

    }


}
