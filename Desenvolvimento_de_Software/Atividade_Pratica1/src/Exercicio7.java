//Crie um programa que simula um caixa eletrônico. O usuário informa o valor a ser sacado, e o programa retorna quantas cédulas de cada valor serão fornecidas (100, 50, 20, 10, 5, 2, 1).
//Exemplo de Entrada:
//Digite o valor do saque: 289
//Saída Esperada:
//Notas de 100: 2
//Notas de 50: 1
//Notas de 20: 1
//Notas de 10: 1
//Notas de 5: 1
//Notas de 2: 2

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //requisita o valor desejado para o saque
        System.out.print("Informe o valor a ser sacado: ");
        int valor = scanner.nextInt();

        int cedulas[] = {100, 50, 20, 10, 5, 2, 1};
        int quant = 0;

        for(int i = 0; i < 7; i++){
            quant = valor / cedulas[i]; //atribui a quantidade de cédulas de um determinado valor(localizado com indice do vetor) a váriavel quant
            System.out.println("Cédulas de " + cedulas[i] + ": " + quant); //mostra a quantidade de cédulas do valor necessárias para o saque
            valor = valor % cedulas[i]; //atualiza o valor que ainda necessita de cédulas
            //se o valor restante for zero, para a execução do loop
            if(valor == 0){
                break;
            }
            else{
                continue;
            }
        }
        scanner.close();
    }
}
