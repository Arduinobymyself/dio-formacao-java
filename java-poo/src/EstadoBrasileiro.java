public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
    PIAUI("PI", "Piauì", 86),
    MARANHAO("MA", "Maranhão", 98),
    CEARA("CE", "Ceará", 85);

    private String nome;
    private String sigla;
    private int DDD;

    private EstadoBrasileiro(String sigla, String nome, int DDD){
        this.sigla = sigla;
        this.nome = nome;
        this.DDD = DDD;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome(){
        return nome;
    }

    public int getDDD(){
        return DDD;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }



}
