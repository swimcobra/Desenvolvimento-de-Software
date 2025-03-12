//Crie um programa que leia 10 números inteiros e informe quantos são pares.
//Saída Esperada:
//Quantidade de números pares: 5

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPar = 0;

        //pede o imput do usuário e se a sobra da divisão for zero adiciona ele a variável numPar
        for (int i = 0; i <= 9; i++){
            System.out.print("Digite o " + (i + 1) + "° número: ");
            int num = scanner.nextInt();
            if(num % 2 == 0){
                numPar += 1;
            }
        }

        System.out.println("Quantidade de números pares: " + numPar);
    }
}
