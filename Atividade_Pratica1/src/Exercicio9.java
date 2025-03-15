/*Crie um jogo onde o computador gera um número aleatório de 1 a 100, e o usuário precisa adivinhar o número. O programa dá dicas ("Maior" ou "Menor") até o usuário acertar.
Exemplo:
Digite seu palpite: 50
Muito alto! Tente um número menor.
Digite seu palpite: 25
Muito baixo! Tente um número maior.
Digite seu palpite: 32
Parabéns! Você acertou!*/

import java.util.Scanner;
import java.util.Random;

public class Exercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int escolha = random.nextInt(100) + 1; //garante que o número mínimo é 1, já que o random geraria entre 0 e 99

        System.out.print("Tente adivinhar o número entre 1 e 100: ");
        int user = scanner.nextInt();

        while(user != escolha){
            if(user < 1 || user > 100){
                System.out.println("Número fora dos parâmetros esperados!");
                System.out.println("Digite seu palpite: ");
                user = scanner.nextInt();
            }
            else if(user > escolha){
                System.out.println("O seu número é maior.");
                System.out.println("Digite seu palpite: ");
                user = scanner.nextInt();
            }
            else if(user < escolha){
                System.out.println("O seu número é menor.");
                System.out.println("Digite seu palpite: ");
                user = scanner.nextInt();
            }
        }
        System.out.println("Parabéns! Você acertou!");
        
        scanner.close();
    }
}
