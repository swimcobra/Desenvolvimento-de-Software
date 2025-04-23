// O que são Exceções?
// Exceção: Erro que acontece em tempo de execução
// Quando o programa encontra um problema que interrompe seu fluxo normal
// Exemplos comuns de exceções:
// - Divisão por zero (ArithmeticException);
// - Acesso a posição inexistente de array (ArrayIndexOutOfBoundsException);
// - Tentar abrir um arquivo inexistente (FileNotFoundException);
// - Entrada de tipo errado com Scanner (InputMismatchException);

// EXEMPLO

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            int resultado = 100 / numero;
            System.out.println("100 / " + numero + " = " + resultado);
        } catch(InputMismatchException e) {
            System.out.println("Erro: Você deve digitar um número inteiro.");
        } catch(ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch(NumberFormatException e) {
            System.out.println("Erro: Valor digitado não pode ser convertido para número.");
        } catch(Exception e) {
            System.out.println("Erro inesperado: "+ e.getMessage());
        } finally {
            System.out.println("Execução finalizada.");
            scanner.close();
        } // Se der algum erro, capture esse erro e me dê acesso a ele através da variável e.
          // O catch mais específico vem antes do Exception (que é mais genérico).
          //Se colocar catch (Exception e) primeiro, os outros nunca serão alcançados.
    }
}