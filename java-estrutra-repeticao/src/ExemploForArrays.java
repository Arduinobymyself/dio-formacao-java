public class ExemploForArrays {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //exemplo com for
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " eh " + alunos[x]);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        //exemplo com for-each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


    }
}
