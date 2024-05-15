package MSNmessenger;


// a classe  MSNmessenger é ou representa
public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        //Primeiro confirmar se esta conectado a internet
        validarConectadoInternet();
            System.out.println("Enviando mensagem");
            //depois de enviada, salva o histótico da mensagem
        salvarHistoricoMensagem();

        }
        public void receberMensagem() {
            System.out.println("Recebendo Mensagem");
    }

    //Métodos privadas , visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado  a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico da mensagem");
    }

}
