package equipamentos.multiFuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {


    @Override
    public void copiar() {
        System.out.println("COPIANDO EQUIPAMENTO MULTIFUNCIONAL");

    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO EQUIPAMENTO MULTIFUNCIONAL");

    }
}
