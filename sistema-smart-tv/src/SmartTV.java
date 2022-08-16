public class SmartTV {
    boolean ligada = false;
    int canal = 13;
    int volume = 15;

    public void ligar(){
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo volume para: " + volume);
    }

    public void subirCanal(){
        canal++;
    }

    public void baixarCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
