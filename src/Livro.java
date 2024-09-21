public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro() {
        this.titulo = "titulo";
        this.autor = "autor";
        this.isbn = "000-0-00-00000-0";
        this.disponivel = true;
    }

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado: " + titulo);
            return true;
        } else {
            System.out.println("Livro não disponível: " + titulo);
            return false;
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("O livro já está disponível: " + titulo);
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}

