public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8976543");
       // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("9765432");
       // z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();

    }
}
