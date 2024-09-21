public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria() {
        this.titular = "Desconhecido"; // valor padrão
        this.numeroConta = "0000-0"; // valor padrão
        this.saldo = 0.0; // saldo inicial
    }

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // saldo inicial
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // adiciona o valor ao saldo
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor; // subtrai o valor do saldo
            System.out.println("Saque realizado: R$ " + valor);
            return true;
        } else {
            System.out.println("Saque inválido. Verifique o valor.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo; // retorna o saldo atual
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + getSaldo());
    }
}
