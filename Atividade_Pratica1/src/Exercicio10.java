/* Crie um jogo onde o usuário escolhe "par" ou "ímpar", digita um número e o computador gera um número aleatório entre 1 e 10. O programa soma os números e informa quem venceu.
Exemplo de Entrada:
Escolha (par ou ímpar): par
Digite um número: 4
Saída Esperada:
Computador escolheu: 5
Soma: 9 → Ímpar
Você perdeu! */

import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int escolha = random.nextInt(10) + 1;

        System.out.print("Digite 'P' para par e 'i' para Ímpar: ");
        String userParImpar = scanner.nextLine();
        System.out.print("Escolha um número: ");
        int userNum = scanner.nextInt();

        userParImpar = userParImpar.toLowerCase();
        int total = userNum + escolha;
        
        String resultado;

        if(total % 2 == 0){
            resultado = "Par";
        }
        else{
            resultado = "Ímpar";
        }

        System.out.println("Computador Escolheu: " + escolha);
        System.out.println("Soma: " + total + " --> " + resultado);

        if(resultado.equals("Par") && userParImpar.equals("p")){
            System.out.println("Você Ganhou!");
        }
        else if(resultado.equals("Ímpar") && userParImpar.equals("i")){
            System.out.println("Você Ganhou!");
        }
        else if(resultado.equals("Par") && userParImpar.equals("i")){
            System.out.println("Você Perdeu!");
        }
        else if(resultado.equals("Ímpar") && userParImpar.equals("p")){
            System.out.println("Você Perdeu!");
        }
        else{
            System.out.println("Algo de errado aconteceu");
        }
        
        scanner.close();
    }
}
