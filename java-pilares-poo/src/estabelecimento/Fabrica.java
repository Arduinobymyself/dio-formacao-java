package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laser;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressoraDesk = new DeskJet();
        impressoraDesk.impimir();

        Impressora impressoraLaser = new Laser();
        impressoraLaser.impimir();

        EquipamentoMultifuncional mult = new EquipamentoMultifuncional();
        mult.copiar();
        mult.digitalizar();
        mult.impimir();


        Digitalizadora scanner = new Scanner();
        scanner.digitalizar();

       Copiadora xerox = new Xerox();
        xerox.copiar();



    }
}
