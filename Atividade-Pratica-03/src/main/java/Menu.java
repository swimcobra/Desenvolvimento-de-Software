import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Livro> livros = new HashMap<>();
        int comando = 0;

        do {
            System.out.println("=== Instruções ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Sair");
            System.out.print("- O que deseja fazer? ");
            comando = scanner.nextInt();

        } while(comando != 4);
    }
}