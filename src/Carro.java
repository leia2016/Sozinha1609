public class Carro {

    // Atributos básicos
    private String modelo;
    private String cor;
    private String placa;
    private int velocidadeAtual;

    // Construtor padrão
    public Carro() {
        this.modelo = "modelo";
        this.cor = "cor";
        this.placa = "placa";
        this.velocidadeAtual = 50;
    }

    public Carro(String modelo, String cor, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.velocidadeAtual = 50;
    }

    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        } else {
            velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual do carro: " + velocidadeAtual + " km/h");
    }

    public void exibirDados() {
        System.out.println("modelo: " + modelo);
        System.out.println("cor: " + cor);
        System.out.println("placa: " + placa);
        exibirVelocidade();
    }
}

