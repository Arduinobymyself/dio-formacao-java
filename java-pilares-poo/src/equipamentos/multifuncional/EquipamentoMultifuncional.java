package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("MULTIFUNCIONAL COPIANDO");
    }

    @Override
    public void digitalizar() {
        System.out.println("MULTIFUNCIONAL DIGITALIZANDO");
    }

    @Override
    public void impimir() {
        System.out.println("MULTIFUNCIONAL IMPRIMINDO");
    }
}
