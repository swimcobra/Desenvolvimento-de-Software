import java.util.HashSet;
import java.util.Set;

public class Livro implements Emprestavel{
    Set<String> isbn = new HashSet<String>();
    String titulo;
    String autor;
    Boolean disponivel;

    public Livro(String titulo, String autor, String isbn, Boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.isbn.add(isbn);
    }

    @Override
    public void emprestar() {
        if(disponivel){
            System.out.println("Livro emprestado!");
            disponivel = false;
        } else {
            System.out.println("Livro não disponível");
        }
    }

    @Override
    public void devolver() {
        System.out.println("Livro devolvido!");
        disponivel = true;
    }
}
