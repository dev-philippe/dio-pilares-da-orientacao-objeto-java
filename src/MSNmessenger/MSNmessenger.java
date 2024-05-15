package MSNmessenger;

public class MSNmessenger {
    public  void enviarMensagem(){
        validarConectandoInternet();
        System.out.println("Enviando messagem");
        salvarHistoricoMensaem();
    }
    public  void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private   void validarConectandoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensaem(){
        System.out.println("Salvando histórico de mensagem");
    }

}
