public class TestaContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Marileia Vargas", "3218-9");

        conta.exibirDados();

        conta.depositar(900.00);
        conta.depositar(150.75);

        conta.exibirDados();

        conta.sacar(600.00);

        conta.exibirDados();

        conta.sacar(800.00);

        conta.exibirDados();
    }
}
