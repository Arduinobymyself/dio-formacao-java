package abms.com;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // remove de um índice específico
    public T remove(int index){
        No<T> noPivot = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivot.getProximoNo());
        return noPivot.getConteudo();
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //sdiciona no final da lista
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo); //cria um novo nócom o conteúdo

        if(this.isEmpty()){
            referenciaEntrada = novoNo; //passa a referência em memória do objeto novoNo
            return;
        }

        No<T> noAuxiliar = referenciaEntrada; // cria um novo nó auxiliar  e recebe a referência em memória

        //percorre a lista até o final e adiciona o novo nó
        for(int i = 0; i < this.size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        // adiciona o novo nó
        noAuxiliar.setProximoNo(novoNo);
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice "
                    + index
                    + " desta lista. Esta lista só vai até o índice "
                    + ultimoIndice
                    + " .");
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = referenciaEntrada;

        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteúdo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();

        }
        strRetorno += "null";

        return strRetorno;
    }
}
