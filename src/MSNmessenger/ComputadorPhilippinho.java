package MSNmessenger;

import Apps.FacebookMessenger;
import Apps.MSNmessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class ComputadorPhilippinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*

        NÃO SE SABE QUAL APP
        MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM


         */

        String appEscolhido ="msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNmessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();


        }


    }




