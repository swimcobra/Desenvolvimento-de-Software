import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Livro> livros = new HashMap<>();
        int comando;
        String isbn;
        String titulo;
        String autor;

        do {
            System.out.println("\n=== Instruções ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar todos os livros");
            System.out.println("5. Sair");
            System.out.print("\n- O que deseja fazer? ");
            comando = scanner.nextInt();
            scanner.nextLine();

            switch(comando){
                case 1:
                    System.out.print("Digite o código ISBN: ");
                    isbn = scanner.nextLine();

                    try {
                        if(livros.containsKey(isbn)) {
                            throw new ExceptionISBNCadastrado();
                        }

                        System.out.print("Digite o título: ");
                        titulo = scanner.nextLine();
                        System.out.print("Digite o autor: ");
                        autor = scanner.nextLine();
                        Livro l = new Livro(titulo, autor, isbn);
                        livros.put(isbn, l);
                        System.out.println("Livro cadastrado!");
                    } catch(ExceptionISBNCadastrado e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Informe o ISBN do livro que deseja emprestar: ");
                    isbn = scanner.nextLine();
                    Livro l = livros.get(isbn);
                    if(l == null) {
                        System.out.println("Livro não existente");
                    } else {
                        try {
                            l.emprestar();
                            System.out.println("Livro emprestado!");
                        } catch(ExceptionLivroIndisponivel e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe o ISBN do livro que deseja devolver: ");
                    isbn = scanner.nextLine();
                    l = livros.get(isbn);
                    if(l == null) {
                        System.out.println("Livro não existente");
                    } else {
                        l.devolver();
                    }
                    break;
                case 4:
                    if(livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado");
                    } else {
                        System.out.println("=== Livros ===");
                        for(Livro livro : livros.values()) {
                            System.out.println("\nCódigo ISBN: " + livro.getIsbn());
                            System.out.println("Título: " + livro.getTitulo());
                            System.out.println("Autor: " + livro.getAutor());
                            System.out.println("Disponibilidade: " + livro.getDisponibilidade());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Encerrando programa\n...\n...\n...");
                    break;
                default:
                    System.out.println("Comando Inválido!");
            }
        } while(comando != 5);
        System.out.println("Programa Encerrado!");
        scanner.close();
    }
}