public class TestaCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("208", "Prata", "AJY-5893");

        carro.exibirDados();

        carro.acelerar();
        carro.acelerar();

        carro.frear();

        carro.exibirVelocidade();

        carro.frear();
        carro.frear();

        carro.exibirDados();
    }
}
