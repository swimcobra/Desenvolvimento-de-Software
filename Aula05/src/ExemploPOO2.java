import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    void dizerOla(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos!");
    }
}
public class ExemploPOO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        pessoa.idade = scanner.nextInt();

        pessoa.dizerOla();

        scanner.close();
    }
}
