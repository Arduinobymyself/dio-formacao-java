package apps;

public abstract class ServicoMensagenInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected  void validarConectadoInternet(){
        System.out.println("Validando se está conectado à internet");
    }
}
