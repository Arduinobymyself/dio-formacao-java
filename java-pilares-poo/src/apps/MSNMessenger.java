package apps;

public class MSNMessenger extends ServicoMensagenInstantanea {


    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagen via MSN");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem via MSN");

    }
}
