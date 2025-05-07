import java.util.Scanner;
import java.io.*;
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        Pessoa pessoa = new Pessoa(nome, idade);

        // SERIALIZAÇÃO (Salvar objeto em arquivo)

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.dat"))) {
            oos.writeObject(pessoa); //Salva o objeto no arquivo
            System.out.println("Objeto Pessoa salvo com sucesso!");
        } catch(IOException e) {
            System.out.println("Erro ao salvar o objeto: " + e.getMessage());
        }

        // DESSERIALIZAÇÃO (Ler o objeto do arquivo)

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.dat"))) {
            Pessoa pessoaLida = (Pessoa) ois.readObject(); // Lê o objeto e faz cast
            System.out.println("\nObjeto lido do arquivo: ");
            pessoaLida.exibirDados(); // Exibe os dados
        } catch(IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler o objeto: " + e.getMessage());
        }
        scanner.close();
    }
}
