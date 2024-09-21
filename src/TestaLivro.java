public class TestaLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("A Cabana", "Marileia Vargas", "9956-2-15-59846-2");

        livro.exibirDados();

        livro.emprestar();

        livro.exibirDados();

        livro.devolver();

        livro.exibirDados();

        livro.emprestar();
    }
}
