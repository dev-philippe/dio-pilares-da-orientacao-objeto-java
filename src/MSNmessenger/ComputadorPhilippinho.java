package MSNmessenger;

public class ComputadorPhilippinho {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        System.out.println("MSN");
        MSNmessenger msn = new MSNmessenger();

        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebbok");

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("Telegram");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();


    }
}
