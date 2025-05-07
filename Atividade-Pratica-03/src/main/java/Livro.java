public class Livro implements Emprestavel{
    String isbn;
    String titulo;
    String autor;
    Boolean disponibilidade = true;

    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void emprestar() throws ExceptionLivroIndisponivel {
            if(!disponibilidade) {
                throw new ExceptionLivroIndisponivel();
            }
        disponibilidade = false;
    }

    @Override
    public void devolver() {
        System.out.println("Livro devolvido!");
        disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }
}