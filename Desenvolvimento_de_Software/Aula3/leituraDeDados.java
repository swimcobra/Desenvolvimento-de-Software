import java.util.Scanner;
public class leituraDeDados{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.print("Digite um número decimal: ");
        double decimal = scanner.nextDouble();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
                //Lê apenas a primeira palavra
        
        scanner.nextLine(); //Limpeza de memória

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("O número inteiro é: " + inteiro);
        System.out.println("O número decimal é: " + decimal);
        System.out.println("A palavra é: " + palavra);
        System.out.println("A frase é: " + frase);

        scanner.close();
    }

}