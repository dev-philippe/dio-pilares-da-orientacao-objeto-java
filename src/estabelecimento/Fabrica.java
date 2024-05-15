package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multiFuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;



        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();



    }
}
