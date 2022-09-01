package apps;

public class FacebookMessenger extends ServicoMensagenInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem via Facebook");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendomensagem via Facebook");

    }
}
