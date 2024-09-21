public class TestaAluno {

    public static void main(String[] args) {

        double[] notas = { 8.8, 9.0, 5.0 };

        Aluno aluno = new Aluno("Mari", 36, "512", notas);

        aluno.exibirDados();
    }
}
