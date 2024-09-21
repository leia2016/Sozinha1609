public class TestaRetangulo {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(8.0, 4.0);

        retangulo.exibirDados();

        retangulo.setLargura(8.0);
        retangulo.setAltura(4.0);

        retangulo.exibirDados();
    }
}
